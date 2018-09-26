package training.ipb.recycleview;

import java.util.ArrayList;

public class MotorData {

    public static String[][] data = new String[][]{

            //{"Jenis kendaraan","Versi atau Contoh Produk","Gambar dari google"}

            {"BENELLI", "BENELLI Adventure TRK 251", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Benelli_logo.svg/380px-Benelli_logo.svg.png"},

            {"BMW Motorrad", "BMW HP4 RACE", "https://motorcycle-logos.com/wp-content/uploads/2016/10/BMW-Motorcycle-Logo.png"},

            {"Harley Davidson", "ALL-NEW FXDR™ 114", "https://upload.wikimedia.org/wikipedia/id/7/70/Harley_Davidson_logo.jpg"},

            {"Honda", "Honda Vario 150", "https://designslogo.files.wordpress.com/2009/12/22494-honda-logo2.jpg"},

            {"Kawasaki", "Kawasaki Ninja 250 R", "https://botw-pd.s3.amazonaws.com/styles/logo-original-577x577/s3/032012/kawasaki_logo_ok.jpg?itok=F_bvSTe0"},

            {"KTM", "KTM 390 DUKE", "https://vignette.wikia.nocookie.net/rr3/images/0/05/Ktm-logo.jpg/revision/latest?cb=20140426090331"},

            {"Suzuki", "Suzuki Satria F150", "https://botw-pd.s3.amazonaws.com/styles/logo-thumbnail/s3/032011/s_wayoflife_vert_color-converted.jpg?itok=HzWyF9gl"}
    };

    public static ArrayList<Motor> getListData(){
        Motor motor = null;
        ArrayList<Motor> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            motor = new Motor();
            motor.setName(data[i][0]);
            motor.setVersion(data[i][1]);
            motor.setPhoto(data[i][2]);

            list.add(motor);
        }

        return list;
    }
}
