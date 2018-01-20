package com.yom.keycloak.rbi;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yogendra on 1/8/17.
 */
@Component
public class FeatureService {

    public List<String> getFeatures() {
        return Arrays.asList("UPI","IMPS","NEFT","RTGS");
    }
}
