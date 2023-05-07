
import companyX.FileSinkImpl;
import org.example.random.MaxNumberInStack;
import questions.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    }


}




















































    /*
        // 1.0 Secret Santa - the sender can not be the receiver
        //runSecretSanta()
        // 1.1 create stack via LinkedList
        //runCreateStackViaLinkedList()
        // 1.2 find kth smallest element
        //runKthSmallestElement();
        // 1.3 get max of sum array
        //getMaxSumOfSubArray();
        // 1.4 roles by date
        //    runDatTolRolesMap() ;
        // 1.5 Anagram
        //getAnagrams();
        // 1.6 buy and sell stock
        //getBuyAndSellStock();
        // 1.7 getRandomNumber -> 1 till 9 in O(n)
        // getRandomNumber1Till9();
        // 1.8 getRevereseNumber
        // getRevereseNumber();
        // 1.9 sort songs
        // getSortSongs();
        // 1.10 setAll
        //getSetAll();
        // 1.11
        // getLeftRotateArray();
        //1.12
        // getPlayWuthStream();
        // 1.13
        //getFizzBuzz() ;
        // 1.14
        //getSumOfFactors( );
        //1.15
        //getNthElement();
        // 1.16
        //getRomaniaNumber();
        // 1.17
        // getPascalTriangle();
        // 1.18
        // getIsPowerOf2();
        // 1.19
        //getMissingNumber();
        //1.20
        //getStrToInt();
        // 1.21
        //getAre2StringHasSameLetters();
        // 1.22 convert 12 hour to 24 hour
        //getTimeConversion();
        //1.23 - given n k and target
  //      numRollsToTarget();
        // 1.24 lonelyInteger
       // lonelyInteger();
        //1.25 most common words in sentence
        // mostCommon();
        // 1.26 Roman playground
       // RomanPlayground ( );
        //getBuyAndSellStock();
        // 1.27 Sliding Window
        //SlidingWindow();
        // 1.28 sum linked list
       // sumLinkedList ();
      //  callAPI callAPI = new callAPI();
     //   callAPI.callAPIGET();
     //   callAPI.callAPIPOST();
     //   callAPI.callGet();
  //      diagonalDifference ( );
        var temp =CountingSort.countingSort(Arrays.asList(1,1,3,2,1));
       // int [] arr = {3,2,4};
       // TwoSum.twoSum(arr,6);
        //1.29 add 2 linked list of int
        // addTwoNumbers ( )
        // 1.30 find median of int arr
        //findMedianSortedArrays()
       // reverseLinkedList ( );



    }

    public static void reverseLinkedList ( ) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.left.left = new Node(3);
        head.left.left.left = new Node(4);

        Node reversedHead = ReverseLinkedList.reverseLinkedList(head);

    }
    public static void findMedianSortedArrays ( ) {
        var response =FindMedian.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});

    }
    public static void addTwoNumbers ( ) {

        Add2LinkedListAsInt.ListNode node1 = new  Add2LinkedListAsInt.ListNode(2);
        Add2LinkedListAsInt.ListNode node2 = new  Add2LinkedListAsInt.ListNode(4);
        Add2LinkedListAsInt.ListNode node3 = new  Add2LinkedListAsInt.ListNode(3);

        node1.next = node2;
        node2.next = node3;


        Add2LinkedListAsInt.ListNode node4 = new  Add2LinkedListAsInt.ListNode(5);
        Add2LinkedListAsInt.ListNode node5 = new  Add2LinkedListAsInt.ListNode(6);
        Add2LinkedListAsInt.ListNode node6 = new  Add2LinkedListAsInt.ListNode(7);

        node4.next = node5;
        node5.next = node6;


        var response = Add2LinkedListAsInt.addTwoNumbers(node1,node4);
    }

    public static void diagonalDifference ( ) {
        DiagonalDifference diagonalDifference = new DiagonalDifference();
        diagonalDifference.diagonalDifference(Arrays.asList(Arrays.asList(1, 2,3), Arrays.asList(3, 4,5), Arrays.asList(6, 7,8)) );

    }

    public static void sumLinkedList ( ) {
        SumLinkedList sumLinkedList = new SumLinkedList();
        sumLinkedList.sumLinkedList( );

    }
    public static void SlidingWindow ( ) {
        SlidingWindow slidingWindow = new SlidingWindow();
        int response = slidingWindow.findSlidingWindow( );

    }
    public static void RomanPlayground ( ) {
        RomanNumberToInt romanNumberToInt = new RomanNumberToInt();
        int response = romanNumberToInt.getRomanNumberToInt1("MMXXIII" );
        String res = romanNumberToInt.getIntoToRoman(2023);
    }
    public static void mostCommon ( ) {
        MostCommonWords mostCommonWords = new MostCommonWords();
        String [] banned =  new String[]{"hit"};
        mostCommonWords.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned );
    }
    public static void lonelyInteger ( ) {
        LonelyInteger lonelyInteger = new LonelyInteger();
        lonelyInteger.lonelyInteger(Arrays.asList(0,0,1,2,1));
    }
    public static void numRollsToTarget()  {
        RollTheDice rollTheDice = new RollTheDice();
        rollTheDice.numRollsToTarget(2,5,10);

    }
    public static void getTimeConversion() throws ParseException {
        TimeConversion timeConversion = new TimeConversion();
        timeConversion.getTimeConversion("10:20:30PM");

    }

    public static void  getAre2StringHasSameLetters (  ) {
        Are2StringHasSameLetters are2StringHasSameLetters = new Are2StringHasSameLetters();
        are2StringHasSameLetters.getAre2StringHasSameLetters("test", "egst");
    }
    public static void  getStrToInt ( ) {
        StringToInt stringToInt = new StringToInt();
        stringToInt.getStringToInt("2","5");
    }
    public static void  getMissingNumber ( ) {
        int [] arr = new int[]{4,3,2,7,8,2,3,1};
        FindMissingNumber findMissingNumber= new FindMissingNumber();
        findMissingNumber.getMissingNumber(arr);
    }
    public static void getIsPowerOf2 () {
        PowerOf2 powerOf2 = new PowerOf2();
        boolean result =powerOf2.getIsPowerOf2Another(8);
        System.out.println(result);
    }
    public static void getPascalTriangle () {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        pascalsTriangle.getPascalsTriangle(5);
    }
    public static void getDate () {
        HashMap <LocalDateTime , String > roleHistory = new HashMap<>();
        List <LocalDateTime> dates = new ArrayList<>();
        roleHistory.put( LocalDateTime.now().minusMinutes(60) , "Regular");
        roleHistory.put( LocalDateTime.now() , "Medium");
        roleHistory.put( LocalDateTime.now().plusMinutes(100) , "Large");

        dates.add(LocalDateTime.now().minusMinutes(30));
        dates.add(LocalDateTime.now().plusMinutes(10));
        dates.add(LocalDateTime.now().plusMinutes(120));

    }
    public static void getRomaniaNumber()  {
        RomanNumberToInt romanNumberToInt = new RomanNumberToInt();

        romanNumberToInt.getRomanNumberToInt("MCMXII");
    }
    public static void getNthElement()  {
        NthNodeFromEndLinkedList nthNodeFromEndLinkedList = new NthNodeFromEndLinkedList();

        nthNodeFromEndLinkedList.getNthNodeFromEndLinkedList(3);
    }
    public static void getSumOfFactors()  {
        SumOfFactors sunOfFactors = new SumOfFactors();
        int [] arr =  {6,12,24};
        sunOfFactors.getSumOfFactor(arr);
    }
    public static void getFizzBuzz()  {
        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.getFizzBuzz(15);
    }
    public static void getPlayWuthStream() throws IOException {
        PlayWithStream stream = new PlayWithStream();

        stream.playWithStream();
    }
        public static void getLeftRotateArray() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
            int [] arr = {10,20,30,40,50};

            leftRotateArray.getLeftRotateArray(arr);
        }
        public static void getSetAll() {

       SetAll setAll = new SetAll();
       setAll.setValue("1","1");
       setAll.setValue("2","2");
       setAll.setValue("3","3");
       setAll.setValue("4","4");
       setAll.setValue("5","5");

       setAll.print();

       setAll.setValue("1","10");
       setAll.setValue("2","20");

       setAll.print();

       setAll.setAllValues("7");
        setAll.print();


    }
    public static void getSortSongs() {

        SortSongs sortSongs = new SortSongs();
        Song [] songs = { new Song("last", 5.25) , new Song("first" , 1.23) , new Song("middle",3.56)};
        sortSongs.getSortSongs(songs);
    }
    public static void getRevereseNumber() {

        NumberReverse numberReverse = new NumberReverse();
        int arr [] = {9,2,3,4,1};
        numberReverse.getRevereseNumber(124);
    }
    public static void getRandomNumber1Till9() {

        RandomNumber1Till9 randomNumber1Till9 = new RandomNumber1Till9();
        int arr [] = {9,2,3,4,1};
        randomNumber1Till9.getRandomNum1Till9();
    }
    public static void getBuyAndSellStock() {

        BuyAndSell buyAndSell = new BuyAndSell();
        int arr [] = {9,2,3,4,1,2};
        buyAndSell.getBuyAndSell(arr);
        buyAndSell.getBuyAndSell1(arr);

    }

    public static void getAnagrams() {

        Anagram anagram = new Anagram();
        anagram.getAnagrams(Arrays.asList("cat", "dog", "tac", "god", "act"));
    }
    public static void runDatTolRolesMap() {
        System.out.print("Original Map: \n================================\n");

        HashMap<LocalDateTime, String> roleHistoryList = new HashMap<>();
        roleHistoryList.put(LocalDateTime.now().minusHours(1),"Starter");
        roleHistoryList.put(LocalDateTime.now(),"Regular");
        roleHistoryList.put(LocalDateTime.now().plusHours(1),"TeamLeader");
   //     roleHistoryList.put(LocalDateTime.now().minusMinutes(10),"Worker");
   //     roleHistoryList.put(LocalDateTime.now(),"User");
   //     roleHistoryList.put(LocalDateTime.now().plusMonths(1),"Admin");
        roleHistoryList.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
     //   for (HashMap.Entry<LocalDateTime, String> entry : roleHistoryList.entrySet()) {
     //       System.out.print("Date "+ entry.getKey().toString() +"- Role " + entry.getValue() +"\n");

    //    }
        System.out.print("Original Date List: \n###################################\n");

        List <LocalDateTime> dates = Arrays.asList(LocalDateTime.now().minusMinutes(30),LocalDateTime.now().plusMinutes(5),
                LocalDateTime.now().plusMinutes(100));
        for (LocalDateTime date : dates) {
            System.out.print("Date "+ date +"\n");

        }
        RoleHistory roleHistory = new RoleHistory();
        roleHistory.getRoleDatesMap(roleHistoryList,dates);
    }
    public static void getMaxSumOfSubArray() {
        int [] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        MaxArraySunInArray maxArraySunInArray = new MaxArraySunInArray();
        maxArraySunInArray.getSumOfMaxArray(arr);
    }
    public static void runKthSmallestElement() {
        int [] arr = {1,3,2,7,4,8};
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        kthSmallestElement.getKthSammlestElement(arr,5);
    }
    public static void runSecretSanta() {
        SecretSanta secretSanta = new SecretSanta();
        Map<String,String> mySecretSanta = secretSanta.secretSantaMap(List.of("Eran" , "Dan", "Ben" , "Assaf"));
    }
    public static void runCreateStackViaLinkedList() {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.print();
        myStack.pop();
        myStack.print();
    }


}
        */