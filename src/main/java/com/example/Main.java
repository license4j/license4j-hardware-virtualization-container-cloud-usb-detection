package com.example;

import com.license4j.License;

public class Main {

    public static void main(String[] args) {

        // Build license instance with properties
        License.getInstance().getBuilder()
                .product("11DE9AB9EF29E3CA2B68521D4AACC2A7") // any product hash, 32 characters long hex
                .usbDongle(null, null, "license.l4j") // put an empty file in usb stick "license.l4j" to detect
                .build();

        // Get all detected system details within SystemInformation
        // No need to validate a license.
        String output = """
                      System User Name        : %s
                      System Host Name        : %s
                      System Domain Name      : %s
                      System OS Family        : %s
                      System Java Name        : %s
                      System CPU Core Count   : %s
                        
                      System is Virtual       : %s
                      System is Cloud         : %s
                      System is Container     : %s
                      Hypervisor Name         : %s
                      Cloud Provider Name     : %s
                        
                      USB Name                : %s
                      USB Vendor Id           : %s
                      USB Product Id          : %s
                      USB Serial Number       : %s
                      USB Mount Path          : %s
                      """
                .formatted(
                        License.getInstance().getSystemInformation().getOSUserName(),
                        License.getInstance().getSystemInformation().getOSHostName(),
                        License.getInstance().getSystemInformation().getDomainName(),
                        License.getInstance().getSystemInformation().getOSFamily(),
                        License.getInstance().getSystemInformation().getJava(),
                        License.getInstance().getSystemInformation().getCPUCoreCount(),
                        // Virtualization related
                        License.getInstance().getSystemInformation().isVirtual(),
                        License.getInstance().getSystemInformation().isCloud(),
                        License.getInstance().getSystemInformation().isContainer(),
                        License.getInstance().getSystemInformation().getHypervisor(),
                        License.getInstance().getSystemInformation().getCloudProvider(),
                        // USB related
                        License.getInstance().getSystemInformation().getUSBDongleName(),
                        License.getInstance().getSystemInformation().getUSBDongleVendorId(),
                        License.getInstance().getSystemInformation().getUSBDongleProductId(),
                        License.getInstance().getSystemInformation().getUSBDongleSerial(),
                        License.getInstance().getSystemInformation().getUSBDongleMountPath());

        System.out.print(output);
    }
}
