import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Test Data Class which contains names of the fields and ddl values to be selected on QPP
 *
 * @author Olga_Liulkovich
 */
public class QPPfields {

    public static void QPPfields() {

    }

    public static Map<String, String> fillInQPPFieldList() {
        Map<String, String> QPPMap = new LinkedHashMap<String, String>();
        QPPMap.put("offerIDValue", "reuse in a report");
        QPPMap.put("requesterType", "Government");
        QPPMap.put("format", "Print and electronic");
        QPPMap.put("portionUsed", "Full article");
        QPPMap.put("translating", "No");
        return QPPMap;
    }


}
