# LICENSE4J System/Device Detection

Displays detected hardware, and/or virtualization and/or cloud and/or USB stick/disk

## Sample Output

### Windows 10 Physical PC, Notebook with a USB inserted
    System User Name        : demo
    System Host Name        : HPNOTE
    System Domain Name      : hpnote
    System OS Family        : Windows
    System Java Name        : Eclipse Adoptium OpenJDK 64-Bit Server VM 21.0.5
    System CPU Core Count   : 8
    
    System is Virtual       : false
    System is Cloud         : false
    System is Container     : false
    Hypervisor Name         : null
    Cloud Provider Name     : null
    
    USB Name                : Kingston DT 101 II USB Device
    USB Vendor Id           : 0951
    USB Product Id          : 1625
    USB Serial Number       : 001CC0EC3466AA2197EA19F3
    USB Mount Path          : F:\

### Windows Guest on Hyper-V
    System User Name        : demo
    System Host Name        : DESKTOP-DFU23TJ
    System Domain Name      : DESKTOP-DFU23TJ
    System OS Family        : Windows
    System Java Name        : Eclipse Adoptium OpenJDK 64-Bit Server VM 21.0.5
    System CPU Core Count   : 4
    
    System is Virtual       : true
    System is Cloud         : false
    System is Container     : false
    Hypervisor Name         : Microsoft Hyper-V
    Cloud Provider Name     : null
    
    USB Name                : null
    USB Vendor Id           : null
    USB Product Id          : null
    USB Serial Number       : null
    USB Mount Path          : null

### Amazon EC2 Instance
    System User Name        : ubuntu
    System Host Name        : ip-172-31-12-125
    System Domain Name      : ip-172-31-12-125.eu-central-1.compute.internal
    System OS Family        : Ubuntu
    System Java Name        : Ubuntu OpenJDK 64-Bit Server VM 17.0.14
    System CPU Core Count   : 1
    
    System is Virtual       : true
    System is Cloud         : true
    System is Container     : false
    Hypervisor Name         : Xen HVM
    Cloud Provider Name     : Amazon EC2
    
    USB Name                : null
    USB Vendor Id           : null
    USB Product Id          : null
    USB Serial Number       : null
    USB Mount Path          : null


### VPS Server
    System User Name        : demo
    System Host Name        : ahost.company.com
    System Domain Name      : localhost
    System OS Family        : AlmaLinux
    System Java Name        : Eclipse Adoptium OpenJDK 64-Bit Server VM 21.0.6
    System CPU Core Count   : 4
    
    System is Virtual       : true
    System is Cloud         : false
    System is Container     : false
    Hypervisor Name         : KVM
    Cloud Provider Name     : null
    
    USB Name                : null
    USB Vendor Id           : null
    USB Product Id          : null
    USB Serial Number       : null
    USB Mount Path          : null
