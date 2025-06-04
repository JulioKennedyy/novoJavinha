package EstudoXml;

import com.thoughtworks.xstream.XStream;

public class SalvarDados {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        Estoque e = new Estoque("Macaxeira", 5);
        String xml = xstream.toXML(e);
        System.out.println(xml);
    }
}
