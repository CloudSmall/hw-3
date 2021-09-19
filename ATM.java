

public class ATM {
    public int countBanknotes(int sum){
        int count = 0;
        int count500=0;
        int count200=0;
        int count100=0;
        int count50=0;
        int count20=0;
        int count10=0;
        int count5=0;
        int count2 = 0;
        int count1=0;
        while (sum>=500){
            count500++;
            sum-=500;}
        while (sum>=200){
            count200++;
            sum-=200;}
        while (sum>=100){
            count100++;
            sum-=100;}
        while (sum>=50){
            count50++;
            sum-=50;}
        while (sum>=20){
            count20++;
            sum-=20;}
        while (sum>=10){
            count10++;
            sum-=10;}
        while (sum>=5){
            count5++;
            sum-=5;}
        while (sum>=2){
            count2++;
            sum-=2;}
        while (sum>=1){
            count1++;
            sum-=1;}

return count = count500 + count200+count100+count50+count20+count10 +count5+ count2 +count1;

    }

    public static void main(String[] args) {
        ATM cou = new ATM();
        System.out.println(cou.countBanknotes(500));
    }
}
