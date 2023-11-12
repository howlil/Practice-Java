

public class MemberGold extends Member implements CanRequestCicilan, CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
        if (totalBelanja >= 500000 && totalBelanja <= 1000000){
            this.totalBayar = totalBelanja - (totalBelanja * 2/100); 
        }
        else if (totalBelanja > 1000000 && totalBelanja <= 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 4/100); 
        }
        else if (totalBelanja > 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 6/100); 
        }
        else{
        this.totalBayar = totalBelanja; 
    }

        return this.totalBayar;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
        return hitungCicilanPerBulan(totalBelanja, jumlahBulan);
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 7){
            jarakTujuan = (jarakTujuan - 6.3) * 1000.0;
            this.ongkir = Math.round(jarakTujuan * 10.0) / 10.0;
            
        }

        return this.ongkir;
    }
    
}
