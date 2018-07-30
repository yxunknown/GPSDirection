# GPSDirection
calculate two gps points direction
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
 
 
 实现如下网页提及算法
 https://www.sunearthtools.com/cn/tools/distance.php#top 
