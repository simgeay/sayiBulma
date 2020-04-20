public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,8,0};
        int aranacak = 9;
        boolean bulundu = false;
        for(int sayi : sayilar){
            if(aranacak == sayi){
                bulundu = true;
                break;
            }
        }
        if(bulundu){
            System.out.println("sayi bulundu");
        }
        else{
            System.out.println("sayi bulunamadi");
        }
    }
}
