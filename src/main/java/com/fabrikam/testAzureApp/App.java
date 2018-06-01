package com.fabrikam.testAzureApp;

import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.compute.AvailabilitySet;
import com.microsoft.azure.management.compute.AvailabilitySetSkuTypes;
import com.microsoft.azure.management.compute.CachingTypes;
import com.microsoft.azure.management.compute.InstanceViewStatus;
import com.microsoft.azure.management.compute.DiskInstanceView;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineSizeTypes;
import com.microsoft.azure.management.network.PublicIPAddress;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkInterface;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.rest.LogLevel;
import java.io.File;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {    
            final File credFile = new File(App.class.getResource("/azureauth.properties").getPath());
            Azure azure = Azure.configure()
                .withLogLevel(LogLevel.BASIC)
                .authenticate(credFile)
                .withDefaultSubscription();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
