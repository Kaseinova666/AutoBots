package com.autobots.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FindAverageSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT"));


        Map<String, Double> averageSalaryByDep = new HashMap<>();// Наз-ие департамента и з/п
        Map<String, Integer> averageByDep = new HashMap<>();     // Наз-ие департмаента и кол-во людей
        for (Employee employee : employees){                     // employee по очереди перебирает каждого сотрудника

            averageSalaryByDep.put(employee.getDepartment(),   // put(...) — сохраняем новое (обновлённое) значение в карту.
        // employee.getDepartment() — получаем название департамента, например "IT".
                    averageSalaryByDep.getOrDefault(employee.getDepartment(), 0.0)
        // averageSalaryByDep.getOrDefault(..., 0.0) — проверяем, есть ли уже запись в карте:
                            //Если да — возвращается существующее значение (сумма зарплат).
                            //Если нет — возвращается 0.0.
                            + employee.getSalary());              // + employee.getSalary() — прибавляем зарплату текущего сотрудника.

            averageByDep.put(employee.getDepartment(),            // put(...) — обновляем карту.
                    //Считаем, сколько людей в каждом департаменте.
                    //.getOrDefault(..., 0) — если ещё никого не было, начнём с 0.
                    //+ 1 — прибавляем одного сотрудника.
                    averageByDep.getOrDefault(employee.getDepartment(),0) +1);
        }
        double averageSel = 0.0;                                  // Создаём переменную averageSel, чтобы временно хранить среднюю зарплату для департамента.

        for (String dep : averageSalaryByDep.keySet()) {
            // Запускаем цикл по всем департаментам, которые есть в карте averageSalaryByDep.
            //.keySet() — это множество всех ключей в Map, то есть всех департаментов: "IT", "HR" и т.д.
            //dep — переменная, которая будет содержать название текущего департамента.
            averageSel = averageSalaryByDep.get(dep) / averageByDep.get(dep);
            //averageSalaryByDep.get(dep) — получаем общую сумму зарплат для департамента dep
            //averageByDep.get(dep) — получаем количество сотрудников в этом департаменте
            //Делим одно на другое → получаем среднюю зарплату
            //Сохраняем в переменную averageSel
            System.out.printf("%s -> $%.2f%n", dep, averageSel);
            // System.out.printf(...) — форматированный вывод (как printf в C)
            //%s — вставляет строку (название департамента)
            //%.2f — вставляет число типа double, округлённое до 2 знаков после запятой
            //%n — переход на новую строку (аналог \n, но кроссплатформенный)

        }

        System.out.println("_______________________________________________");

        Map<String, Double> averageSalaryByDepWithStream = employees.stream()
                // employees.stream() — превращает список сотрудников (List<Employee>) в поток элементов.
                .collect(Collectors.groupingBy(Employee :: getDepartment,
                //.collect(...) — операция, которая собирает результат потока в нужную структуру (здесь — Map).
        Collectors.averagingDouble(Employee :: getSalary)));
        // Collectors.groupingBy(...) — группирует сотрудников по департаменту (ключом будет String — название департамента).

        // Employee::getDepartment
        //— метод-ссылка, которая указывает: группировать по результату employee.getDepartment()
        //(эквивалентно e -> e.getDepartment())
        //
        //Collectors.averagingDouble(Employee::getSalary)
        //— внутри каждой группы считает среднее значение по зарплатам (double)
        //— Employee::getSalary — ссылка на метод, возвращающий зарплату

        averageSalaryByDepWithStream.forEach((dep, averageSalary)
                -> System.out.println(dep + " -> " + " $" + averageSalary  ));

        System.out.println("__________________________________");

        for (Map.Entry<String, Double> entry : averageSalaryByDepWithStream.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }
}
