//i++; stops but without it creates infinite loop
public class ForLoopsPractice {
    public static void main(String[] args) {
    int i =1;
    while(i<=10){
        System.out.println(i);
        i++;
}
    for(int j =1;j<=1000;j++){
        System.out.println(j);
    }
    for(int k =0;k<=100;k+=10){
        System.out.println(k);
    }
}
}

//A loop must have a loop
// control variable
//The loop control variable must
//br initialized, checked, and changed.