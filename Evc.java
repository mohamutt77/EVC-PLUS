

import java.util.Scanner;

// Check MAAFI 2.3
public class Evc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PIN_Number = 1121;
        double Haraagga = 50;
        System.out.println("Fadlan geli short code ka EVC Plus si aad gudaha uugu gudubto: ");
        String ShortCode = input.nextLine();

        if (ShortCode.equals("*770#")) {
            System.out.println("Fadlan geli pin kaga: ");
            int PIN = input.nextInt();
            if (PIN == PIN_Number){
                System.out.println("EVCPlus");
                System.out.println(" " +
                        "1. Itus Haraagaaga " +
                        "\n 2. Kaarka Hadalka " +
                        "\n 3. Bixi Biil " +
                        "\n 4. U wareeji EVCPlus " +
                        "\n 5. Warbixin Kooban " +
                        "\n 6. Salaam Bank " +
                        "\n 7. Maareynta " +
                        "\n 8. Bill Payment");
                int Options = input.nextInt();
                switch (Options) {
                    // Section 1 - > Itus haraagaaga
                    case 1:
                        System.out.println("Haraagaagu waa " + Haraagga);
                        break;
                    // Section 2 --> Kaarka Hadalka
                    case 2:
                        System.out.println("Kaarka hadalka");
                        System.out.println(" " +
                                "1. Kuhubo Airtime " +
                                "\n 2. Ugu shub Airtime " +
                                "\n 3. MIFI Packages " +
                                "\n 4. Shubo Internet " +
                                "\n 5. Ugu shub qof kale (MMT)");
                        int Kaarka_Hadalka = input.nextInt();
                        switch (Kaarka_Hadalka) {
                            // 2.1 Ku shubo Airtime
                            case 1:
                                System.out.println("Ku shubo Air Time ");
                                System.out.println("Fadlan geli lacagta");
                                double Kushbo_Airtime = input.nextDouble();
                                System.out.println("Mahubtaa inaad " + Kushbo_Airtime + "ugu shubtd undefined? \n 1. Haa \n 2. Maya");
                                int YesOrNo = input.nextInt();
//                                if lacagta aad kushubanaysid  ay ka yar tahay 0 display (Lacagta aad ku shubanaysid ma aha mid sax ah)
                                if (YesOrNo == 1){
                                    double newBalance = Haraagga - Kushbo_Airtime;
                                    if (Haraagga < Kushbo_Airtime){
                                        System.out.println("Haraagaga xisaabta kuguma filna");
                                    }
                                    else {
                                        System.out.println("[-EVCPlus-] Waxaad $" + Kushbo_Airtime + "ugu shubtay 252617216218," +
                                                "Haraagaagu waa $" + newBalance);
                                    }
                                } else if (YesOrNo == 2) {
                                    System.out.println( " Mahadsanid ");
                                }
                                else {
                                    System.out.println(" Waxaa doorate number khaldan");
                                }

                                break;
                            // 2.2 Ugu shub Airtime
                            case 2:
                                System.out.println("Ugu shub Airtime");
                                System.out.println("Fadlan Geli Numberka");
                                int To_Number = input.nextInt();
                                System.out.println("Faldan Geli Lacagta ");
                                double Lacagta_ladirayo = input.nextInt();

                                System.out.println("Mahubtaa inaad $" + Lacagta_ladirayo + " ugu shubtid " + To_Number + "\n 1. Haa \n 2. Maya");

                                int YesOrNO = input.nextInt();
                                if (YesOrNO == 1){
                                    double newBalance = Haraagga - Lacagta_ladirayo;
                                    if (Lacagta_ladirayo < 0 || Lacagta_ladirayo > Haraagga) {
                                        System.out.println("Lacagta La dirayo wuxuu ka badan yahay Haraaga ama ka yar yahay 0");
                                    }
                                    else {
                                        System.out.println("[-EVCPlus-] Waxaad $" + Lacagta_ladirayo + " ugu shubtay"  + To_Number +
                                                "Haraagaagu waa $" + newBalance);
                                    }

                                } else  {
                                    System.out.println("Mahadsanid");
                                }

                                break;
//                              2.3 MiFi Packages
                            case 3:
                                System.out.println("MIFI Packages");
                                System.out.println("1. Kushubo data-da MIFI");
                                int Kushubo_MIFI_Package = input.nextInt();
                                if (Kushubo_MIFI_Package == 1){
                                    System.out.println("Internet Bundle Package: \n " +
                                            "1. Isbuucle (Weekly) \n " +
                                            "2. Maalinle (Daily) \n " +
                                            "3. Bille (MIFI)");
                                    int Internet_Bundle_MIFI_packages = input.nextInt();
                                    switch (Internet_Bundle_MIFI_packages){
                                        case 1:
                                            System.out.println("Isbuucle (Weekly)");
                                            System.out.println("Fadlan dooro bundle-ka: \n " +
                                                    "1. $5 = 10GB \n " +
                                                    "2. $10 = 25GB  ");
                                            int MIFI_Weekly = input.nextInt();
                                            if (MIFI_Weekly == 1){
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $5 = 10GB ku shubatid? (1. Yes 2. No)");
                                                int Weekly_YesOrNo = input.nextInt();
                                                if (Weekly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $5 = 10GB kushubatid");
                                                } else if (Weekly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else if (MIFI_Weekly == 2) {
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $10 = 25GB ku shubatid? (1. Yes 2. No)");
                                                int Weekly_YesOrNo = input.nextInt();
                                                if (Weekly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $10 = 25GB kushubatid");
                                                } else if (Weekly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else {
                                                System.out.println("fadlan Dooro 1. $5 = 10GB 2. $10 = 25GB");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Maalinle (Daily)");
                                            System.out.println("Fadlan dooro bundle-ka: \n " +
                                                    "1. $1 = 2GB \n " +
                                                    "2. $2 = 5GB  ");
                                            int MIFI_DAILY = input.nextInt();
                                            if (MIFI_DAILY == 1){
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $1 = 2GB ku shubatid? (1. Yes 2. No)");
                                                int DAILY_YesOrNo = input.nextInt();
                                                if (DAILY_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $1 = 2GB kushubatid");
                                                } else if (DAILY_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else if (MIFI_DAILY == 2) {
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $2 = 5GB ku shubatid? (1. Yes 2. No)");
                                                int DAILY_YesOrNo = input.nextInt();
                                                if (DAILY_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $2 = 5GB kushubatid");
                                                } else if (DAILY_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else {
                                                System.out.println("fadlan Dooro 1. $1 = 2GB 2. $2 = 5GB");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Bille (MIFI)");
                                            System.out.println("Fadlan dooro bundle-ka: \n " +
                                                    "1. $20 = 40GB \n " +
                                                    "2. $40 = 85GB \n " +
                                                    "3. $60 = 150GB \n " +
                                                    "4. $25 = Monyhly Limit  ");
                                            int MIFI_Monthly = input.nextInt();
                                            if (MIFI_Monthly == 1){
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $20 = 40GB ku shubatid? (1. Yes 2. No)");
                                                int Monthly_YesOrNo = input.nextInt();
                                                if (Monthly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $20 = 40GB kushubatid");
                                                } else if (Monthly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else if (MIFI_Monthly == 2) {
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $40 = 85GB ku shubatid? (1. Yes 2. No)");
                                                int Monthly_YesOrNo = input.nextInt();
                                                if (Monthly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $40 = 85GB kushubatid");
                                                } else if (Monthly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else if (MIFI_Monthly == 3) {
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $60 = 150GB ku shubatid? (1. Yes 2. No)");
                                                int Monthly_YesOrNo = input.nextInt();
                                                if (Monthly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $60 = 150GB kushubatid");
                                                } else if (Monthly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            } else if (MIFI_Monthly == 4) {
                                                System.out.println("Fadlan MIFI user: ");
                                                int MIFI_User = input.nextInt();
                                                System.out.println("Ma hubtaa inaad $25 = Monthly Limit ku shubatid? (1. Yes 2. No)");
                                                int Monthly_YesOrNo = input.nextInt();
                                                if (Monthly_YesOrNo == 1){
                                                    System.out.println("Waad ku guuleysatay inaad $25 = Monthly Limit kushubatid");
                                                } else if (Monthly_YesOrNo == 2) {
                                                    System.out.println("Mahadsanid");
                                                } else {
                                                    System.out.println("write only 1. yes or 2. no");
                                                }
                                            }
                                            else {
                                                System.out.println("fadlan Dooro 1. $20 = 40GB 2. $40 = 85GB 3. $60 = 150GB 4.$25 = Monthly Limit");
                                            }
                                            break;
                                        default:
                                            System.out.println("Fadlan Dooro Mid kamid ah Numbers 1 - 4");
                                    }
                                } else {
                                    System.out.println("Dooro Number 1 si aad gudaha ugu gasho MIFI Packages");
                                }
                                break;
//                            2.3 Kushubo Internet
                            case 4:
                                System.out.println("Fadlan Dooro Number-ka aad ku shubanayso: " +
                                        "\n 1. Isbuucle (Weekly) " +
                                        "\n 2. TIME BASED PACKAGES" +
                                        "\n 3. DATA" +
                                        "\n 4. Maalile (Daily)" +
                                        "\n 5. Bille (MiFi)");
                                int Kushubo_internet = input.nextInt();
                                switch (Kushubo_internet){
                                    case 1:
                                        System.out.println("Isbuucle");
                                        System.out.println("Fadlan geli Lacagta");
                                        int Lacagta = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lacagta + " ku shubatid (1. yes 2. No)");
                                        int LacagtaYesOrNo = input.nextInt();
                                        if (LacagtaYesOrNo == 1){
                                            System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta + " oo Isbuucle ah");
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Time based packages");
                                        System.out.println("Fadlan geli Lacagta");
                                        int Lacagta_Time_Based = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lacagta_Time_Based + " ku shubatid (1. yes 2. No)");
                                        int Lacagt_Time_Based_YesOrNo = input.nextInt();
                                        if (Lacagt_Time_Based_YesOrNo == 1){
                                            System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta_Time_Based + " oo Time Based Package ah");
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Data");
                                        System.out.println("Fadlan geli Lacagta");
                                        int Lacagta_Data = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lacagta_Data+ " ku shubatid (1. yes 2. No)");
                                        int Lacagta_Data_YesOrNo = input.nextInt();
                                        if (Lacagta_Data_YesOrNo == 1){
                                            System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta_Data+ " oo Data ah");
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Maalinle");
                                        System.out.println("Fadlan geli Lacagta");
                                        int Lacagta_Maalinle = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lacagta_Maalinle + " ku shubatid (1. yes 2. No)");
                                        int Lacagt_Maalinle_YesOrNo = input.nextInt();
                                        if (Lacagt_Maalinle_YesOrNo == 1){
                                            System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta_Maalinle + " oo Maalinle ah");
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Bille ");
                                        System.out.println("Fadlan geli Lacagta");
                                        int Lacagta_Bille = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $" + Lacagta_Bille + " ku shubatid (1. yes 2. No)");
                                        int Lacagt_Bille_YesOrNo = input.nextInt();
                                        if (Lacagt_Bille_YesOrNo == 1){
                                            System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta_Bille + " oo Bille ah");
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                }

                                break;
                            case 5:
                                System.out.println("Ugu shub qofkale MMT");
                                System.out.println("Fadlan geli Number-ka aad ugu shubayso: ");
                                int To_User = input.nextInt();
                                System.out.println("Fadlan geli Lacagta");
                                int Lacagta_MMT = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + Lacagta_MMT + " ugu shubaysid Number-kan " + To_User + " (1. yes 2. No)");
                                int Lacagt_MMT_YesOrNo = input.nextInt();
                                if (Lacagt_MMT_YesOrNo == 1){
                                    System.out.println("Waxaad ku guuleysatay inaad ugu shubato $" + Lacagta_MMT + " Number-kan " + To_User + " oo MMT ah");
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                        }
                        break;
//                        Bixi Biil
                    case 3:
                        System.out.println("Bixi Biil");
                        double Bill_Balance = 25;
                        System.out.println("Fadlan dooro 1. Post paid 2. Ku iibso");
                        int Bill_Options = input.nextInt();
                        if (Bill_Options == 1){
                            System.out.println("Post paid: \n " +
                                    "1. Ogow Biil-ka \n " +
                                    "2. Bixi Biil \n " +
                                    "3. Ka bixi biil");

                            int PostPaidOptions = input.nextInt();
                            switch (PostPaidOptions){
                                case 1:
                                    System.out.println("Haraagaagu Bill-ka waa $" + Bill_Balance);
                                    break;
                                case 2:
                                    System.out.println("Fadlan Geli Lacagta: ");
                                    double PayBill = input.nextInt();
                                    System.out.println("Ma hubtaa inaad bixisid Bill lacagtisu ay tahay $" + PayBill + " (1. Haa 2. Maya)");
                                    int PayBill_YesOrNo = input.nextInt();
                                    if (PayBill_YesOrNo == 1){
                                        System.out.println("Waxaad bixisay Bill lacagatisu ay dhan tahay $" + PayBill + " Mahadsanid");
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Ka bixi Bill");
                                    System.out.println("Fadlan Geli Mobile-ka: ");
                                    int Mobile_number = input.nextInt();
                                    System.out.println("Fadlan Geli Lacagta: ");
                                    double Lacagta = input.nextDouble();
                                    if (Bill_Balance < Lacagta){
                                        System.out.println("Haraagaagu Bill-ka kuguma filna");
                                    } else {
                                        System.out.println("Mahubtaa inaad bixisid Bill lacagtisu tahay $" +Lacagta + " oolaga rabo tel no " + Mobile_number + " (1. Yes 2. No)");
                                        int BillYesOrNo = input.nextInt();
                                        if (BillYesOrNo == 1){
                                            System.out.println("Waxaad bixisay bill lacagtisu ay tahay $" + Lacagta + " kana dirtay " + Mobile_number);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    }
                            }
                        } else if (Bill_Options == 2) {
                            System.out.println("Ku iibso");
                            System.out.println("Fadlan geli aqoonsiga: ");
                            int Aqoonsiga_Ganacsiga = input.nextInt();
                            System.out.println("Fadlan Geli Lacagta: ");
                            double LacagtaToAqonsiga = input.nextDouble();
                            System.out.println("Mahubtaa inaa ku iibsatid $" + LacagtaToAqonsiga + " kana iibsatid " + Aqoonsiga_Ganacsiga + " (1. Haa 2. Maya )");
                            int AqoonsigaYesOrNo = input.nextInt();
                            double NewBill_Balance = Bill_Balance - LacagtaToAqonsiga;
                            if (AqoonsigaYesOrNo == 1){
                                System.out.println("Waxaad ku iibsatay $" + LacagtaToAqonsiga + " kana iibsatay " + Aqoonsiga_Ganacsiga + " Haraagaagu waa " + NewBill_Balance + " Mahadanid");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        }

                        break;

                    case 4:
                        System.out.println("Uwareeji EVCPlus");
                        System.out.println("Fadlan Geli Mobile: ");
                        int Phone_Number = input.nextInt();
                        System.out.println("Fadlan Geli Lacagta: ");
                        int Sending_Money = input.nextInt();
                        System.out.println("Ma hubtaa inaad $" + Sending_Money + " u wareejisid " + Phone_Number + " \n(1. Haa 2. Maya)");
                        int UwarejiYesOrNo = input.nextInt();
                        double Net_Haraaga = Haraagga - Sending_Money;
                        if (UwarejiYesOrNo == 1){
                            System.out.println("Waxaad $" + Sending_Money + " u wareejisay " + Phone_Number + " Haraagaagu waa $" + Net_Haraaga);
                        } else {
                            System.out.println("Mahadsanid");
                        }
                        break;
                    case 5:
                        System.out.println(" Warbixin Kooban: \n " +
                                "1. Last Action \n " +
                                "2. Wareejinti Ugu Dambeyse \n " +
                                "3. Iibshadi Ugu Dambeyse \n " +
                                "4. Last 3 Actions \n " +
                                "5. Email Me My Activity");
                        int Wareejin_Options = input.nextInt();
                        if (Wareejin_Options == 1){
                            System.out.println("$0.75 ayaad uwareejisay 252617216219, Taariikh: 22/04/25 14:06:00");
                        } else if (Wareejin_Options == 2) {
                            System.out.println("Statementiga: \n " +
                                    "1. U dirtay \n " +
                                    "2. Ka Heshay " );
                            int Warejin_Statements = input.nextInt();
                            if (Warejin_Statements == 1){
                                System.out.println("Fadlan Geli Lambarka aad udirtay: ");
                                int SendedNumber = input.nextInt();
                                System.out.println("$0.75 ayaad uwareejisay " + SendedNumber + ", Taariikh: 22/04/25 14:06:00");
                            } else if (Warejin_Statements == 2) {
                                System.out.println("Fadlan Geli Number-ka aad ka heshay: ");
                                int ReceivedMobile = input.nextInt();
                                System.out.println("Operation succeeded No Recieved Transactions to display!");
                            }
                        } else if (Wareejin_Options == 3) {
                            System.out.println("Fadlan Geli Aqoonsiga Ganacsiga: ");
                            int Aqoonsiga_Ganacsiga = input.nextInt();
                            System.out.println("Operation succeeded No Transactions to display to this Number!");
//                            Last 3 Actions
                        } else if (Wareejin_Options == 4) {
                            System.out.println("Fadlan Geli Aqoonsiga Ganacsiga ");
                            int Aqoonsiga_Ganacsiga = input.nextInt();
                            System.out.println("Operation succeeded No Transactions to display!");
                        } else if (Wareejin_Options == 5) {
                            System.out.println("Fadlan Geli Email-kaga" );
                            String Email_Me = input.nextLine().trim().toLowerCase();
                            System.out.println("Geli Taariikhda Hore (Maalin/Bisha/Sanadka) : ");
                            String Taariikh_Hore = input.nextLine().trim().toLowerCase();
                            System.out.println("Geli Taariikhda Dambe (Maalin/Bisha/Sanadka) : ");
                            String Taariikh_Dambe = input.nextLine().trim().toLowerCase();
                            System.out.println("Your Request is being processed and the activity will be emailed to " + Email_Me);
                        } else {
                            System.out.println("Selection Error: Fadlan Dooro 1 - 5");
                        }
                        break;
                    case 6:
                        System.out.println("Salaam Bank: \n " +
                                "1. Itus Haraagaaga \n " +
                                "2. Lacag Dhigasho \n " +
                                "3. Lacag Qaadahso \n " +
                                "4. Ka wareeji EVCPlus \n " +
                                "5. Ka wareeji Account-kaga \n " +
                                "6. Hubi Wareejinta Account-kaga \n " +
                                "7. Maaraynta Bank-ga \n " +
                                "8. Kala bax ");
                        int SalaamBankOptions = input.nextInt();
                        int Bank_PIN_Number = 2211;
                        int Bank_Number = 21621821;
                        double Bank_Balance = 303;
                        String Bank_Account_Holder = "Abukar Ibrahim Mohamed";
//                        6.1 Itus Haraagaaga
                        if (SalaamBankOptions == 1){
                            System.out.println("Fadlan Geli Number-kaga sirta ee Bank-ga" );
                            int Bank_PIN_Code = input.nextInt();
                            if (Bank_PIN_Code == Bank_PIN_Number){
                                System.out.println("Koontada Bank-ga:" + Bank_Number + " " + Bank_Account_Holder + " Haraagaagu waa $" + Bank_Balance + " USD");
                            }  else {
                                System.out.println("Incorrect Bank Password");
                            }
//                            6.2 Lacag Dhigasho
                        } else if (SalaamBankOptions == 2 ) {
                            System.out.println("Fadlan Geli Lacagta: ");
                            double LacagDhigasho = input.nextDouble();
                            System.out.println("Fadlan Geli Macluumaad: ");
                            input.nextLine();
                            String Macluumaad = input.nextLine();
                            System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                            int Bank_PIN_Code = input.nextInt();
                            if (Bank_PIN_Code == Bank_PIN_Number){
                                System.out.println("Ma hubtaa inaad $" + LacagDhigasho + " dhigtid Account kaga Bank-ga? (1. Haa 2. Maya)");
                                int Bank_Dhigasho_Yes_Or_No = input.nextInt();
                                if (Bank_Dhigasho_Yes_Or_No == 1){
                                    double NewBalance = LacagDhigasho + Bank_Balance;
                                    System.out.println("Waxaad ku guuleysatay inaad $" + LacagDhigasho + " dhigatid Bank-kaga " + Bank_Number + " Haraagaagu cusub ee koontada waa $" + NewBalance);
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                            }
                        } else if (SalaamBankOptions == 3) {
                            System.out.println("Fadlan Soo Geli Lacagta:");
                            double Lacag_Qaadasho = input.nextDouble();
                            System.out.println("Fadlan Geli Macluumaad: ");
                            input.nextLine();
                            String QaadashoMacluumaad = input.nextLine();
//                            String Macluumaad = input.nextLine();
                            System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                            int Bank_PIN_Code = input.nextInt();
                            if (Bank_PIN_Code == Bank_PIN_Number) {
                                System.out.println("Ma hubtaa inaad $" + Lacag_Qaadasho + " ka qaadatid Account kaga Bank-ga? (1. Haa 2. Maya)");
                                int Bank_Qaadasho_Yes_Or_No = input.nextInt();
                                double newBalance = Bank_Balance - Lacag_Qaadasho;
                                if (Bank_Balance < Lacag_Qaadasho){
                                    System.out.println("Haraagaagu koontada kuguma filna ");
                                } else {
                                    if (Bank_Qaadasho_Yes_Or_No == 1) {
                                        System.out.println("Waxaad ku guuleysatay inaad $" + Lacag_Qaadasho + " ka qaadatid Bank-kaga " + Bank_Number + " Haraagaagu cusub ee koontada waa $" + newBalance);
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                }


                            }
                        } else if (SalaamBankOptions == 4) {
                            System.out.println("Ka wareeji EVCPlus: \n " +
                                    "1. Salaam Somali Bank \n " +
                                    "2. Salaam SCH \n " +
                                    "3. Bank Beeraha \n " +
                                    "4. Darusalam Bank \n " +
                                    "5. MyBank LTD");
                            int Ka_Wareeji_Options = input.nextInt();
                            if (Ka_Wareeji_Options == 1){
                                System.out.println("Fadlan Geli Account-kaga ");
                                int Account_Number = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad: ");
                                input.nextLine();
                                String Macluumaad = input.nextLine();
                                System.out.println("Invalid");
                            } else if (Ka_Wareeji_Options == 2) {
                                System.out.println("Fadlan Geli Account-kaga ");
                                int Account_Number = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad: ");
                                input.nextLine();
                                String Macluumaad = input.nextLine();
                                System.out.println("Invalid");
                            } else if (Ka_Wareeji_Options == 3) {
                                System.out.println("Fadlan Geli Account-kaga ");
                                int Account_Number = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad: ");
                                input.nextLine();
                                String Macluumaad = input.nextLine();
                                System.out.println("Invalid");
                            } else if (Ka_Wareeji_Options == 4) {
                                System.out.println("Fadlan Geli Account-kaga ");
                                int Account_Number = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad: ");
                                input.nextLine();
                                String Macluumaad = input.nextLine();
                                System.out.println("Invalid");
                            } else if (Ka_Wareeji_Options == 5) {
                                System.out.println("Fadlan Geli Account-kaga ");
                                int Account_Number = input.nextInt();
                                System.out.println("Fadlan Geli Macluumaad: ");
                                input.nextLine();
                                String Macluumaad = input.nextLine();
                                System.out.println("Invalid");
                            } else {
                                System.out.println("Selection Error: Fadlan Dooro Numbers 1 - 5");
                            }
                        } else if (SalaamBankOptions == 5) {
                            System.out.println("Account to Account: ");
                            System.out.println("Fadlan Geli Account ama Mobile Number: ");
                            int Account_Mobile = input.nextInt();
                            System.out.println("Fadlan Geli Lacagta: ");
                            double Lacagta_Account = input.nextDouble();
                            System.out.println("Fadlan Geli Macluumaad: ");
                            input.nextLine();
                            String Macluumaad = input.nextLine();
                            System.out.println("Fadlan Geli Number-ka sirta ah: ");
                            int BankPINCode = input.nextInt();
                            if (Bank_PIN_Number == BankPINCode){
                                System.out.println("Ma hubtaa inaad $" + Lacagta_Account + " u wareejisid Account Number-ka " + Account_Mobile + " ( 1. Haa 2. Maya)");
                                int Account_Warejin_Yes_Or_No = input.nextInt();
                                if (Account_Warejin_Yes_Or_No == 1){
                                    System.out.println("Waxaad ku guuleysatay inaad $" + Lacagta_Account + " u wareejisid koontada " + Account_Mobile + " Mahadsanid!");
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                            } else {
                                System.out.println("Incorrect PIN Code");
                            }

                        } else if (SalaamBankOptions == 6) {
                            System.out.println("Fadlan Geli OTP-ga");
                            int OTP = input.nextInt();
                            System.out.println("Invalid");
                        } else if (SalaamBankOptions == 7) {
                            System.out.println("Maareynta Bank-ga: \n " +
                                    "1. Bedel PIN-ka Bank-ga \n " +
                                    "2. Bedel Password-ka E-Bank-ga");
                            int Maareynta_Bankga = input.nextInt();
                            if (Maareynta_Bankga == 1){
                                System.out.println("Fadlan Geli PIN-ka Cusub ee koontada:");
                                int NewBank_PIN_Code = input.nextInt();
                                System.out.println("Ku celi PIN ka cusub ee koontada");
                                int Confirm_PIN_Code = input.nextInt();
                                if (NewBank_PIN_Code == Confirm_PIN_Code){
                                    System.out.println("Waxaad ku guuleysatay inaad badasho bin kaga sirta ee koontada");
                                }
                                else {
                                    System.out.println("Confirm Password Not Matching");
                                }
                            } else if (Maareynta_Bankga == 2) {
                                System.out.println("Fadlan Geli PIN-ka Cusub ee koontada E-Bank:");
                                int NewE_Bank_PIN_Code = input.nextInt();
                                System.out.println("Ku celi PIN ka cusub ee koontada");
                                int Confirm_PIN_Code = input.nextInt();
                                if (NewE_Bank_PIN_Code == Confirm_PIN_Code){
                                    System.out.println("Waxaad ku guuleysatay inaad badasho bin kaga sirta ee koontada E-Bank:");
                                }  else {
                                    System.out.println("Confirm Password Not Matching");
                                }
                            }
                        } else if (SalaamBankOptions == 8) {
                            System.out.println("Fadlan Aqoonsiga Codsiga: ");
                            int Aqoonsiga = input.nextInt();
                            System.out.println("Invalid");
                        } else {
                            System.out.println("Selection Error: Fadlan Dooro 1 - 8");
                        }

                        break;
                    case 7:
                        System.out.println("Maareynta \n " +
                                "1. Bedel Lambarka Sirta ah \n " +
                                "2. Bedel Luqadda \n " +
                                "3. Wargelin Mobile Lumay \n " +
                                "4. Lacag Xirasho \n " +
                                "5. U celi Lacag Qaldante ");
                        int MaarayntaOptions = input.nextInt();
                        if (MaarayntaOptions == 1){
                            System.out.println("Fadlan Geli PIN kaga cusub");
                            int NewPINCode = input.nextInt();
                            System.out.println("Hubi PIN-Kaga cusub");
                            int ConfirmPINCode = input.nextInt();
                            if (ConfirmPINCode == NewPINCode){
                                System.out.println("[-EVCPlus-] waad ku guuleysatay inaa badasho PIN-kaga");
                            } else {
                                System.out.println("Confirm PIN code is not matching the new PIN code");
                            }
                        } else if (MaarayntaOptions == 2) {
                            System.out.println("Fadlan Dooro Luqadda: (1. English 2. Somali)");
                            int SelectLanguage = input.nextInt();
                            if (SelectLanguage == 1){
                                System.out.println("[-EVCPlus-] You have successfully changed your language");
                            } else if (SelectLanguage == 2) {
                                System.out.println("[-EVCPlus-] Waad ku guuleysatay in aad badasho luqadda");
                            } else {
                                System.out.println("Selection Error: Fadlan Dooro Luqadda (1. English 2. Somali)");
                            }
                        } else if (MaarayntaOptions == 3) {
                            System.out.println("Fadlan Geli Mobile-ka Lumay: ");
                            int Lost_Mobile_PIN_code = 4411;
                            int LostMobileNumber = input.nextInt();
                            System.out.println("Fadlan Geli Number-kisa sirta ah: ");
                            int LostMobilePINCode = input.nextInt();
                            if (LostMobilePINCode == Lost_Mobile_PIN_code){
                                System.out.println("Waad ku mahadsan tahay wargelintada; waxaana kugu adeegi doonnaa sida ugu dhaqsiyaha badan");
                            } else {
                                System.out.println("Number sireedka aad gallisay Ma aha mid jira");
                            }
                        } else if (MaarayntaOptions == 4) {
                            System.out.println("Fadlan Geli Number-ka lagu khalday: ");
                            int Lagu_Khalday = input.nextInt();
                            System.out.println("Fadlan Geli Lambarka loo waday: ");
                            int Loo_Waday = input.nextInt();
                            System.out.println("Fadlan Geli Macluumaad");
                            String Macluumaad = input.nextLine().trim().toLowerCase();
                            System.out.println("Ma hubtaa inaad xirato lacagta (1. Haa 2. Maya)");
                            int Maclumad_Yes_Or_No = input.nextInt();
                            if (Maclumad_Yes_Or_No == 1){
                                System.out.println("Waxaan kuugu adeegi doonna sida ugu dhaqsiyaha badan; Mahadsanid!");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        } else if (MaarayntaOptions == 5) {
                            System.out.println("Fadlan Geli Number-ka lacagta kugu soo khalday: ");
                            int Soo_khaldaha = input.nextInt();
                            System.out.println("Fadlan Geli Macluumaad");
                            String Macluumaad = input.nextLine().trim().toLowerCase();
                            System.out.println("Ma hubtaa inaad lacag u celinaysid Number-kan " + Soo_khaldaha + " (1. Haa 2. Maya)");
                            int Maclumad_Yes_Or_No = input.nextInt();
                            if (Maclumad_Yes_Or_No == 1){
                                System.out.println("Waxaad ku guuleysatay inaa lacagta dib isaga celiso; Mahadsanid!");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Bill Payement");
                        System.out.println("-- EVCPlus -- \n " +
                                "1. Itus Haraagaaga Bill-ka: \n " +
                                "2. Wada Bixi Bill-ka \n " +
                                "3. Qayb Ka bixi Bill-ka");
                        int Bill_Payement_Options = input.nextInt();
                        if (Bill_Payement_Options == 1){
                            System.out.println("Fadlan Geli Reference Number: ");
                            int Reference_Number = input.nextInt();
                            System.out.println("Haraagaagu Bill-ka waa $35.5");
                        } else if (Bill_Payement_Options == 2) {
                            System.out.println("Fadlan Geli Reference Number: ");
                            int Reference_Number = input.nextInt();
                            System.out.println("Waa lawada Bixiyay Bill-ka! Mahadsanid");
                        } else if (Bill_Payement_Options == 3) {
                            System.out.println("Fadlan Geli Number-ka aad udirayso Bill-ka");
                            int To_Bill_user = input.nextInt();
                            System.out.println("Fadlan Geli Lacagta Bill-ka");
                            double Lacagta_Billka = input.nextDouble();
                            System.out.println("Waxaad ku guuleysatay inaad qayb ka bixiso Bill-ka!  Mahadsanid");
                        }
                        break;
                    default:
                        System.out.println("Number ka aad dooratay ma aha mid jira, fadlan dooro Number 1 ilaa 8 u dhaxeeya");
                }
            }
            else {
                System.out.println("PIN ka aad galisay ma ahan mid jira ");
            }
        } else {
            System.out.println("Shortcode ka aa garaacday ma aha mid jira, fadlan garaac *770#");
        }

    }
}