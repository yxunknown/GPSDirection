/**
 * @author mevur
 * @date 18/7/30
 *
 * 用于计算两个GPS 坐标点之间的方位
 * 要确定从地球上两点之间的起点的方向，请使用以下公式:
 *
 * Δφ = ln( tan( latB / 2 + π / 4 ) / tan( latA / 2 + π / 4) )
 * Δlon = abs( lonA - lonB )
 * θ = atan2( Δlon ,  Δφ )
 *
 * Note:
 * 1) ln = natural log
 * 2) if Δlon > 180°  then  Δlon = Δlon (mod 180).
 * 3) operation a mod n
 * 4) function atan2(y, x)
 * 5) the angles are in radians
 **/
public class Direction {

    public static final double PI = Math.PI;


    /**
     * 经度：longitude
     * 纬度：latitude
     * @param lat1
     * @param lon1
     * @param lat2
     * @param lon2
     * @return
     */
    public double getDirection(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        double deltaFI = Math.log(Math.tan(lat2 / 2 + PI / 4) / Math.tan(lat1 / 2 + PI / 4));
        double deltaLON = Math.abs(lon1 - lon2) % 180;
        double theta = Math.atan2(deltaLON, deltaFI);
        return Math.toDegrees(theta);
    }

    public static void main(String[] args) {
        Direction d = new Direction();
        System.out.println(183.223 % 180);
        System.out.println(d.getDirection(40.86809 , -72.81945, 41.64244, -71.71289));
    }
}
