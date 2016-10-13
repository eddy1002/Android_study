package eddy1001.quickcode01;

/**
 * Created by 조대웅 on 2016-09-29.
 */
public class MyMinimum extends MyValues {
    public float getValue(int[] A){
        float Min = A[0];
        for (int i = 0; i < A.length; i++){
            if (Min >= A[i])
                Min = A[i];
        }

        return Min;
    }
}
