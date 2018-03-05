import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Test Data Class which contains names of the QPP fields and QPP values to be displayed on details pages
 *
 * @author Olga_Liulkovich
 */
public class QPPDetailsfields {

    public void QPPDetailsfields() {
    }

    public static Map<String, String> fillInQPPDetailsfields() {
        Map<String, String> QPPMap = new LinkedHashMap<String, String>();
        QPPMap.put("offerDisplayText", "Report");
        QPPMap.put("requesterType", "Government");
        QPPMap.put("format", "Print and electronic");
        QPPMap.put("PortionUsed", "Full article");
        QPPMap.put("translating", "No");

        return  QPPMap;

    }
}
