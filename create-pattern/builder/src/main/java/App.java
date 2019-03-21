import com.alibaba.fastjson.JSONObject;

public class App {

    public static void main(String[] args) {
        System.out.println(JSONObject.toJSONString(new Person.Builder().
            withHairColor(HairColor.BLACK).
            withFaceColor(FaceColor.BLACK).
            withJob(Job.EXPERT).
            build()));
    }
}
