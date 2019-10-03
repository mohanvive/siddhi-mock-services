/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.siddhi.sample.mock.ride.estimate.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * RideEstimate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen",
        date = "2019-04-03T18:22:48.929Z")
public class RideEstimate {

    @JsonProperty("healthy")
    private String rideEstimate = null;

    public RideEstimate rideEstimate(String rideEstimate) {
        this.rideEstimate = rideEstimate;
        return this;
    }

    /**
     * Server runtime rideEstimate
     *
     * @return rideEstimate
     **/
    @ApiModelProperty(value = "Server runtime rideEstimate")
    public String getRideEstimate() {
        return rideEstimate;
    }

    public void setRideEstimate(String rideEstimate) {
        this.rideEstimate = rideEstimate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RideEstimate rideEstimate = (RideEstimate) o;
        return Objects.equals(this.rideEstimate, rideEstimate.rideEstimate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rideEstimate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RideEstimate {\n");

        sb.append("    RideEstimate: ").append(toIndentedString(rideEstimate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

