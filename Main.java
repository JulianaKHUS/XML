public class Main {
    List<Employee> list = parseXML("data.xml");
    String json = listToJson(list);

     writeString("output.json",json);

}
