package Draft;

import java.util.*;

import static javax.swing.UIManager.get;

public class CodingBat1 {
    public static void main(String[] args) {
        CodingBat1 obj = new CodingBat1();

//        System.out.println(obj.front3("AB"));
//        System.out.println(obj.front3("Java"));
//
//        System.out.println(obj.backAround("cat"));
//        System.out.println(obj.backAround("hello"));
//        System.out.println(obj.backAround("a"));

//        System.out.println(obj.or35(3));
//        System.out.println(obj.or35(10));
//        System.out.println(obj.or35(8));

//        System.out.println(obj.front22("kitten"));
//        System.out.println(obj.front22("Ha"));
//        System.out.println(obj.front22("abc"));
//        System.out.println(obj.front22(""));
//        System.out.println(obj.front22("a"));
//
//        System.out.println(obj.startHi("hi there"));
//        System.out.println(obj.startHi("hi"));
//        System.out.println(obj.startHi("hello hi"));

//        System.out.println(obj.makeOutWord("<<>>", "Yay"));

//        System.out.println(obj.extraEnd("Hello"));
//        System.out.println(obj.firstTwo("Hello"));

//        System.out.println(obj.firstHalf("WooHoo"));

//        System.out.println(obj.withoutEnd("Hello"));

//        System.out.println(obj.comboString("Hello", "hi"));
//        System.out.println(obj.comboString("hi", "hello"));

//        System.out.println(obj.nonStart("Hello", "There"));
//
//        System.out.println(obj.left2("Hello"));
//        System.out.println(obj.left2("Java"));

//        System.out.println(obj.firstLast6(new int[] {1,2,6}));
//        System.out.println(obj.firstLast6(new int[] {6,1,2,5}));
//        System.out.println(obj.firstLast6(new int[] {1,6,2,5}));

//        System.out.println(obj.sameFirstLast(new int[]{1, 2, 3}));
//        System.out.println(obj.sameFirstLast(new int[]{1, 2, 3, 1}));

//        System.out.println(obj.commonEnd(new int[] {1,2,3}, new int[]{7, 3}));
//        System.out.println(obj.commonEnd(new int[] {1,2,3}, new int[] {7,3,2}));

//        System.out.println(Arrays.toString(obj.rotateLeft3(new int[]{1, 2, 3})));
//        System.out.println(Arrays.toString(obj.reverse3(new int[] {1,2,3})));

//        System.out.println(Arrays.toString(obj.maxEnd3(new int[] {1,2,3})));

//        System.out.println(obj.doubling(Arrays.asList(1, 2, 3)));
//        System.out.println(obj.doubling(Arrays.asList(6, 8, 6, -1)));
//        System.out.println(obj.doubling(Arrays.asList()));

//        System.out.println(obj.square(Arrays.asList(1,2,3)));
//        System.out.println(obj.square(Arrays.asList(6,8,-6,-8,1)));
//        System.out.println(obj.square(Arrays.asList()));

//        System.out.println(obj.addStar(Arrays.asList("a", "bb", "ccc")));

//        System.out.println(obj.copies3(Arrays.asList("a", "bb", "ccc")));
//        System.out.println(obj.copies3(Arrays.asList("24", "hello")));

//        System.out.println(obj.moreY(Arrays.asList("a","b","c")));

//        System.out.println(obj.math1(Arrays.asList(1,2,3)));

//        System.out.println(obj.rightDigit(Arrays.asList(1, 22, 93)));

        Map<String, String> map = new HashMap<>();
        map.put("a", "spacy");
        map.put("b", "candy");
        System.out.println(obj.mapBully(map));


    }


//    }
//    public String frontBack(String str) {
//        if (str.length() == 1) {
//            return str;
//        } else {
//
//        }

//    public String front3(String str) {
//        if (str.length() <= 3) {
//            return str + str + str;
//        } else {
//            String resultStr = str.substring(0, 3);
//            return resultStr + resultStr + resultStr;
//        }
//    }

//    public String backAround(String str) {
//        if (str.length() >= 2) {
//            String lastIndex = str.substring(str.length()-1);
//            return lastIndex + str + lastIndex;
//        } else {
//            return str + str + str;
//        }
//    }

//    public boolean or35(int n) {
//        if (n % 3 == 0 || n % 5 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public String front22(String str) {
//        if (str.length() > 2) {
//            return str.substring(0, 2) + str + str.substring(0, 2);
//        } else {
//            return str + str + str;
//        }
//    }

//    public boolean startHi(String str) {
//        if (str.startsWith(("hi"))){
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public String makeOutWord(String out, String word) {
//        if (out.length() == 4) {
//            String firstChap = out.substring(0,2);
//            String secondChap = out.substring(2);
//            return firstChap + word + secondChap;
//        } else {
//            return "";
//        }
//    }

//    public String extraEnd(String str) {
//        if (str.length() >= 2) {
//            String strEnd = str.substring(str.length()-2);
//            return strEnd + strEnd + strEnd;
//        } else {
//            return str + str + str;
//        }
//    }

//    public String firstTwo(String str) {
//        if (str.length() < 2) {
//            return str;
//        } else {
//            return str.substring(0,2);
//        }
//    }

//    public String firstHalf(String str) {
//        if (str.length() % 2 == 0) {
//            int halfLength = str.length() / 2;
//            return str.substring(0,halfLength);
//        } else {
//            return str;
//        }
//    }

//    public String withoutEnd(String str) {
//      return str.substring(1, str.length()-1);
//    }

//    public String comboString(String a, String b) {
//        if (a.length() > b.length()) {
//            return b + a + b;
//        } else {
//            return a + b + a;
//        }
//    }

//    public String nonStart(String a, String b) {
//        return a.substring(1) + b.substring(1);
//    }

//    public String left2(String str) {
//        String rightPart = str.substring(str.length()-2);
//        String leftPart = str.substring(0,2);
//        return rightPart + leftPart;
//    }

//    public boolean firstLast6(int[] nums) {
//        int firstIndex = nums[0];
//        int lastIndex = nums[nums.length - 1];
//        if (firstIndex == 6 || lastIndex == 6) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public boolean sameFirstLast(int[] nums) {
//        if (nums.length >= 1) {
//            return nums[0] == nums[nums.length - 1];
//        } else {
//            return false;
//        }
//    }

//    public boolean commonEnd(int[] a, int[] b) {
//        if (a.length >= 1 && b.length >= 1) {
//            return a[0] == b[0] || a[a.length -1] == b[b.length -1];
//        } else {
//            return false;
//        }
//    }

//    public int sum3(int[] nums) {
//        if (nums.length == 3) {
//            return nums[0] + nums[1] + nums[2];
//        } else {
//            return 0;
//        }
//    }

//    public int[] rotateLeft3(int[] nums) {
//        return new int[]{nums[1], nums[2], nums[0]};
//    }

//    public int[] reverse3(int[] nums) {
//        return new int[] {nums[2], nums[1], nums[0]};
//    }

//    public int[] maxEnd3(int[] nums) {
//        if (nums[0] > nums[2]) {
//            return new int[] {nums[0], nums[0], nums[0]};
//        } else {
//            return new int[] {nums[2], nums[2], nums[2]};
//        }
//    }

//    public List<Integer> doubling(List<Integer> nums) {
//        List<Integer> newList = new ArrayList<>();
//        if (!nums.isEmpty()) {
//            for (int i = 0; i < nums.size(); i++) {
//                int result = nums.get(i) * 2;
//                newList.add(result);
//            }
//            return newList;
//        } else {
//            return nums;
//        }
//    }

//    public List<Integer> square(List<Integer> nums) {
//        List<Integer> newList = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            int result = nums.get(i) * nums.get(i);
//            newList.add(result);
//        }
//        return newList;
//    }

//    public List<String> addStar(List<String> strings) {
//        List<String> newListOfStrings = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            String charAddString = strings.get(i) + "*";
//            newListOfStrings.add(charAddString);
//        }
//        return newListOfStrings;
//    }

//    public List<String> copies3(List<String> strings) {
//        List<String> newCopiesList = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            String copiesStr = strings.get(i) + strings.get(i) + strings.get(i);
//            newCopiesList.add(copiesStr);
//        }
//        return newCopiesList;
//    }

//    public List<String> moreY(List<String> strings) {
//        List<String> newList = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            String addCharToStr = "y" + strings.get(i) + "y";
//            newList.add(addCharToStr);
//        }
//        return newList;
//    }

//    public List<Integer> math1(List<Integer> nums) {
//        List<Integer> newList = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            int result = (nums.get(i) + 1) * 10;
//            newList.add(result);
//        }
//        return newList;
//    }

//    public List<Integer> rightDigit(List<Integer> nums) {
//        List<Integer> newList = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            int result = nums.get(i) / 2;
//
//        }
//    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            Map<String, String> newMap = new HashMap<>();
            newMap.put("a", "");
            newMap.put("b", map.get("a"));
            return newMap;
        } else {
            return map;
        }
    }
}


