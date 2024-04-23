
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BODY {
    public static void main (String[] args){
        String namafile ="./src/DATA.CSV";
        String pemisah=",";
        List <HEAD> HEADLIST = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(namafile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] column = line.split(pemisah);
                HEAD r = new HEAD();

                r.panjang = Double.parseDouble(column[0]);
                r.lebar = Double.parseDouble(column[1]);
                r.tinggi = Double.parseDouble(column[2]);


                r.luas = 2*(r.panjang* r.lebar + r.lebar*r.tinggi + r.tinggi*r.panjang);
                r.volume = r.panjang * r.lebar * r.tinggi;

                System.out.println("panjang = " + r.panjang);
                System.out.println("lebar = " + r.lebar);
                System.out.println("tinggi = " + r.tinggi);
                System.out.println("luas = " + r.luas);
                System.out.println("volume =" + r.volume);
                    if (r.luas <20.000 ){
                        System.out.println("nilai cuboid kurang dari batas yaitu " + r.luas);
                    }else {
                        System.out.println("nilai cuboid lebih dari batas yaitu "+ r.luas);
                    }
                HEADLIST.add(r);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
