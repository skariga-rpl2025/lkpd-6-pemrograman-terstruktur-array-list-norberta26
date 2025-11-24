
import java.util.Scanner;

public class SoalPencarianDataArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input jumlah elemen array
        System.out.print("Input jumlah element Array: ");
        int jumlah = input.nextInt();
        
        int[] data = new int[jumlah];
        
        //input elemen array satu persatu
        System.out.println("input " + jumlah + "angka (dipisah dengan enter): ");
        for (int i = 0; i < jumlah; i++){
            data[i] = input.nextInt();
    }
        //input angka yang dicari
        System.out.print("\nInput angka yang akan dicari: ");
        int cari = input.nextInt();
        
        //Proses pencarian (Linear Search)                      
        int indexDitemukan = -1;
        for (int i = 0; i < jumlah; i++){
            if (data[i] == cari){
                indexDitemukan = i;
                break;
            }
        }
        //Output hasil pencarian
        if (indexDitemukan != -1){
            System.out.println("Angka ditemukan pada index ke-" + indexDitemukan);
        }else{
            System.out.println("Angka Tidak Ditemukan");
        }
}
}