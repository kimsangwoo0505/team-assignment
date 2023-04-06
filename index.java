package week02;

import java.util.*;

public class index {
    public static void main(String[] args) {
        //int[] array = {0,1,2,3,4,5,6,7,8,9};
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            linkedList.add(i);}
        Integer[] array = linkedList.toArray(new Integer[linkedList.size()]);
        Random random = new Random();
        //System.out.println(linkedList.toString());

        int randomIndex1 = random.nextInt(array.length);//주어진 범위내 임의의 정수 생성(?)
        int randomNumber1 = array[randomIndex1];//랜덤번째 수를 뽑기(?)
        linkedList.remove(Integer.valueOf(randomNumber1));//int값을 Integer객체로 변환하고 linkedList 리스트에서 지움(?)//변환안하면 그값의 위치를 기준으로 삭제하란뜻으로 삭제된 번째가 걸리면 오류가 발생함(?)
        //System.out.println(linkedList.toString());

        Integer[] array2 = linkedList.toArray(new Integer[linkedList.size()]);//수정된linkedList값을 배열로 변환
        int randomIndex2 = random.nextInt(array2.length);
        int randomNumber2 = array2[randomIndex2];
        linkedList.remove(Integer.valueOf(randomNumber2));//int값을 Integer객체로 변환하고 linkedList 리스트에서 지움
       // System.out.println(linkedList.toString());

        Integer[] array3 = linkedList.toArray(new Integer[linkedList.size()]);//수정된linkedList값을 배열로 변환
        int randomIndex3 = random.nextInt(array3.length);
        int randomNumber3 = array3[randomIndex3];

        int B=0;
        int num =0;
//        int S=0;
        System.out.println(randomNumber1+" "+randomNumber2+" "+randomNumber3+" ");

        for(int S=0; S<4;S++){
            S=0;
            B=0;
            num=num+1;
            Scanner sc =new Scanner(System.in);
            System.out.print(num+"번째 시도:");
            String inputLine = sc.nextLine();//문자열 입력
            int input1 = Character.getNumericValue(inputLine.charAt(0));//inputLine.charAt(0)로 0번째 숫자를 가져와 Character.getNumericValue로 문자의 숫자값을 반환
            int input2 = Character.getNumericValue(inputLine.charAt(1));
            int input3 = Character.getNumericValue(inputLine.charAt(2));

            if (input1==randomNumber1){
                S=S+1;
            }else if(input1==randomNumber2|| input1 == randomNumber3) {
                B=B+1;
            }
            if (input2==randomNumber2){
                S=S+1;
            }else if(input2==randomNumber1|| input2 == randomNumber3){
                B=B+1;
            }
            if (input3==randomNumber3){
                S=S+1;
            }else if(input3==randomNumber2|| input3 == randomNumber1){
                B=B+1;
            }
            System.out.println("S"+S+"B"+B);

            if (S == 3){
                System.out.println(num+"번만에 맞히셨습니다");
                System.out.println("게임을 종료합니다");
            }
        }
    }
}
