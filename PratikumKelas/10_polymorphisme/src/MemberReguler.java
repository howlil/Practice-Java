
public class MemberReguler extends Member{

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
        if (totalBelanja >= 500000 && totalBelanja <= 1000000){
            this.totalBayar = totalBelanja - (totalBelanja * 1/100); 
        }
        else if (totalBelanja > 1000000 && totalBelanja <= 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 2/100); 
        }
        else if (totalBelanja > 7000000){
            this.totalBayar = totalBelanja - (totalBelanja * 3/100); 
        }
        else {
            this.totalBayar = totalBelanja; 
        }
    
        return this.totalBayar;
    }

    
}