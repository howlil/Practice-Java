package id.ac.unand.fti.si.pbo;

public class Member {
    private Integer poin = 0;
    public Integer totbelanja = 0;
    public boolean bayar = false;  


    public Integer hitungTotalBayar(Integer totbelanja){
        bayar = true;
        if(totbelanja >= 500000 && totbelanja <= 1000000){
            totbelanja = totbelanja - (totbelanja * 1/100);
            this.totbelanja = totbelanja;}
        else if (totbelanja > 1000000 && totbelanja <= 10000000){
            totbelanja = totbelanja - (totbelanja * 3/100);
            this.totbelanja = totbelanja;}
        else if (totbelanja > 10000000){
            totbelanja = totbelanja - (totbelanja * 5/100);
            this.totbelanja = totbelanja;}
        this.totbelanja = totbelanja;
        return totbelanja;
    }

    public Integer getPoin() {
        if (bayar = true){
            Integer totbelanja = 0;
            if (this.totbelanja >= 10000){
                for (Integer i = 10000; i <= this.totbelanja;){
                    this.totbelanja = this.totbelanja - 10000;
                    totbelanja++;
                }
                this.poin = this.poin + totbelanja;
            }
        }
        return this.poin;
    }

    public void redeemPoin(Integer poin){
        this.poin = this.poin - poin;
    }


}