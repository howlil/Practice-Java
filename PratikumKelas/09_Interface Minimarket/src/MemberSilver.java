package id.ac.unand.fti.si.pbo;

public class MemberSilver extends Member implements CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
        if (totalBelanja >= 500000 && totalBelanja <= 1000000){
            this.totalBayar = totalBelanja - (totalBelanja * 1/100); 
        }
        else if (totalBelanja > 1000000 && totalBelanja <= 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 3/100); 
        }
        else if (totalBelanja > 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 5/100); 
        }
        else {
            this.totalBayar = totalBelanja; 
        }
        
        return this.totalBayar;
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 5){
            jarakTujuan =  jarakTujuan - 4.3;
            this.ongkir = jarakTujuan * 1500.0;
        }

        return this.ongkir;
    }

}
