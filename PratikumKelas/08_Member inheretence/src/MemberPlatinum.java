package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member{
    
    private Integer saldo = 0;

    public Integer getSaldo() {
        return this.saldo;
    }

    public Integer depositSaldo(Integer uangMasuk){
        this.saldo = this.saldo + uangMasuk;
        return this.saldo;
    }


    @Override
    public Integer hitungTotalBayar(Integer totbelanja){
        bayar = true;
        if(getPoin() <= 250){
            if(totbelanja >= 500000 && totbelanja <= 1000000){
                totbelanja = totbelanja - (totbelanja * 1/100);
                this.totbelanja = totbelanja;
            }
            else if (totbelanja > 1000000 && totbelanja <= 10000000){
                totbelanja = totbelanja - (totbelanja * 3/100);
                this.totbelanja = totbelanja;
            }
            else if (totbelanja > 10000000){
                totbelanja = totbelanja - (totbelanja * 5/100);
                this.totbelanja = totbelanja;
            }
            return totbelanja;
            }
        else if (getPoin() > 250){
            if(totbelanja >= 500000 && totbelanja <= 1000000){
                totbelanja = totbelanja - (totbelanja * 3/100);
                this.totbelanja = totbelanja;
            }
            else if (totbelanja > 1000000 && totbelanja <= 10000000){
                totbelanja = totbelanja - (totbelanja * 5/100);
                this.totbelanja = totbelanja;
            }
            else if (totbelanja > 10000000){
                totbelanja = totbelanja - (totbelanja * 7/100);
                this.totbelanja = totbelanja;
            }
                this.totbelanja = totbelanja;
        }
        return this.totbelanja;
    }
}
