package Lista11.quest1;
import java.time.DateTimeException;
import java.time.LocalDate;

public class MinhaData {
    private int dia;
    private int mes;
    private int ano;

    public MinhaData(int dia, int mes, int ano) throws Exception {
        try {
            // Tenta criar uma data com os valores fornecidos
            LocalDate data = LocalDate.of(ano, mes, dia);
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } catch (DateTimeException e) {
            throw new Exception("Data inválida: " + dia + "/" + mes + "/" + ano);
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

