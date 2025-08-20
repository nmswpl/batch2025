package in.co.nmsworks.week3.day2;

public class CollectionPractice {

    public static void main(String[] args) {

        MapPractice map = new MapPractice();
        map.printTwoWheelVehicles();

        map.removeDuplicateColors();

        map.extractAndPrintColors();

        String color = map.getLongestColor();
        System.out.println();

        map.printFrequencyOfColor();

        map.mergeAndPrintTwoLists();

        map.reverseAndPrintLinkedList();

        map.mergeAndPutInThirdList();

        map.removeEvenAndPrintInAscendingOrder();

        map.removeDuplicateValues();

        map.printIntersectedValuesOfTwoSets();

        map.printMapValueAsLengthOfKeys();

        map.changeNullValueToUnknownAndPrint();
    }
}
