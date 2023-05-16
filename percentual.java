public class percentual {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;


        double valorTotal = sp + rj + mg + es + outros;

        double percentualSP = (sp / valorTotal) * 100;
        double percentualRJ = (rj / valorTotal) * 100;
        double percentualMG = (mg / valorTotal) * 100;
        double percentualES = (es / valorTotal) * 100;
        double percentualOutros = (outros / valorTotal) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + String.format("%.2f",percentualSP) + "%");
        System.out.println("RJ: " + String.format("%.2f",percentualRJ) + "%");
        System.out.println("MG: " + String.format("%.2f",percentualMG) + "%");
        System.out.println("ES: " + String.format("%.2f",percentualES) + "%");
        System.out.println("Outros: " + String.format("%.2f",percentualOutros) + "%");
    }
}
