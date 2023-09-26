package cn.crowdos.kernel.constraint.PrivacyConstraint;

import java.math.BigDecimal;

public class JPaillier {
    public static BigDecimal[] encryptLocation(BigDecimal latitude, BigDecimal longitude) {
        // 保留两位小数并减去0.01
        BigDecimal fuzziness = new BigDecimal("0.01");
        BigDecimal encryptedLatitude = latitude.setScale(2, BigDecimal.ROUND_DOWN).subtract(fuzziness);
        BigDecimal encryptedLongitude = longitude.setScale(2, BigDecimal.ROUND_DOWN).subtract(fuzziness);

        // 返回加密后的经度和纬度
        return new BigDecimal[]{encryptedLatitude, encryptedLongitude};
    }
}