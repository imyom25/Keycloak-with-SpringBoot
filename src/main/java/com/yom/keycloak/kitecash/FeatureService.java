package com.yom.keycloak.kitecash;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yogendra on 1/8/17.
 */
@Component
public class FeatureService {

    public List<String> getFeatures() {
        return Arrays.asList("P2P","IMPS","CASH-IN","CASH-OUT");
    }
}
