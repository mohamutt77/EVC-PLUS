

import java.util.Scanner;

public class EVC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "*";
        double balance = 100;
        double SalaamBankBalance = 1000;

        String lastAction = "Wax ficil ah laguma samayn wali.";
        String[] last3Actions = new String[3];
        int actionIndex = 0;

        System.out.println("Enter the pin Code: ");
        String enterPin = input.nextLine();

        if (enterPin.equals(pin)) {
            System.out.println("EVCPLUS");
            System.out.println("1. Itus Haraaga");
            System.out.println("2. Kaarka Hadalka");
            System.out.println("3. Bixi bill");
            System.out.println("4. U Wareeji EVCPLUS");
            System.out.println("5. Warbixin Kooban");
            System.out.println("6. Salaam Bank");
            System.out.println("7. Mareynta");
            System.out.println("8. Bill Payment");

            System.out.println("Choose (1-8): ");
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Haraagaagu waa $" + balance);
                    break;

                case 2:
                    System.out.println("Kaarka Hadalka");
                    System.out.println("1. Ku Shubo Airtime");

                    int choose2 = input.nextInt();
                    if (choose2 == 1) {
                        System.out.println("Fadlan Gali Lacagta: ");
                        int enterMoney = input.nextInt();
                        System.out.println("Ma hubtaa inaad $" + enterMoney + " ugu shubtid Undefined?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");

                        int confirm = input.nextInt();
                        if (confirm == 1) {
                            if (enterMoney > 0 && enterMoney <= balance) {
                                balance -= enterMoney;
                                System.out.println("Waa lagu guuleystay. Haraagaagu waa $" + balance);
                                lastAction = "Ku shub Airtime $" + enterMoney;
                                last3Actions[actionIndex % 3] = lastAction;
                                actionIndex++;
                            } else {
                                System.out.println("Haraagaaga kuguma filna.");
                            }
                        } else {
                            System.out.println("Mahadsanid");
                        }
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("Bixi Bill");
                    System.out.println("Fadlan Gali Lacagta:");
                    int billAmount = input.nextInt();

                    if (billAmount > 0 && billAmount <= balance) {
                        balance -= billAmount;
                        System.out.println("Bill-ka waa la bixiyay. Haraagaagu waa $" + balance);
                        lastAction = "Bixisay bill $" + billAmount;
                        last3Actions[actionIndex % 3] = lastAction;
                        actionIndex++;
                    } else {
                        System.out.println("Haraagaaga kuguma filna.");
                    }
                    break;

                case 4:
                    System.out.println("Fadlan Gali Mobile-ka:");
                    int mobile = input.nextInt();

                    System.out.println("Fadlan Gali Lacagta:");
                    int transferAmount = input.nextInt();

                    System.out.println("Ma hubtaa inaad $" + transferAmount + " ugu wareejiso " + mobile + "?");
                    System.out.println("1. Haa");
                    System.out.println("2. Maya");
                    int confirmTransfer = input.nextInt();

                    if (confirmTransfer == 1) {
                        if (transferAmount > 0 && transferAmount <= balance) {
                            balance -= transferAmount;
                            System.out.println("Waxaad $" + transferAmount + " u wareejisay " + mobile);
                            System.out.println("Haraagaagu waa $" + balance);
                            lastAction = "U wareejisay $" + transferAmount + " number " + mobile;
                            last3Actions[actionIndex % 3] = lastAction;
                            actionIndex++;
                        } else {
                            System.out.println("Haraagaaga kuguma filna.");
                        }
                    } else {
                        System.out.println("Lacag wareejinta waa la joojiyay.");
                    }
                    break;

                case 5:
                    System.out.println("Warbixin Kooban");
                    System.out.println("1. Last Action ");
                    System.out.println("2. Wareejintii Ugu Dambeysay");
                    System.out.println("3. Last 3 Actions");
                    int WarbixinKooban = input.nextInt();

                    switch (WarbixinKooban) {
                        case 1:
                            System.out.println("Last Action: " + lastAction);
                            break;
                        case 2:
                            System.out.println("Fadlan gali number-ka aad hubineyso:");
                            int checkNumber = input.nextInt();
                            System.out.println("Waxaad hore ugu wareejisay $" + 6 + " number " + checkNumber); // static for demo
                            break;
                        case 3:
                            System.out.println("3 Ficil ee u dambeysay:");
                            for (int i = 0; i < 3; i++) {
                                int index = (actionIndex - i - 1 + 3) % 3;
                                if (last3Actions[index] != null) {
                                    System.out.println((i + 1) + ". " + last3Actions[index]);
                                }
                            }
                            break;
                        default:
                            System.out.println("Xulasho Khaldan.");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Salaam Bank");
                    System.out.println("1. Itus Haraagaaga");
                    System.out.println("2. Lacag Dhigasho");
                    System.out.println("3. Lacag Qaadasho");
                    int SalaamBankChoose = input.nextInt();

                    switch (SalaamBankChoose) {
                        case 1:
                            System.out.println("Haraaga Salaam Bank waa $" + SalaamBankBalance);
                            break;

                        case 2:
                            System.out.println("Fadlan Gali Lacagta:");
                            int LacagDhigasho = input.nextInt();

                            System.out.println("Ma hubtaa inaad $" + LacagDhigasho + " dhigtay Account-kaaga?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int Hubin = input.nextInt();

                            if (Hubin == 1) {
                                if (LacagDhigasho > 0) {
                                    SalaamBankBalance += LacagDhigasho;
                                    System.out.println("Waxaa Account-kaaga lagu daray $" + LacagDhigasho);
                                    System.out.println("Haraaga Salaam Bank waa $" + SalaamBankBalance);
                                    lastAction = "Dhigtay $" + LacagDhigasho + " Salaam Bank";
                                    last3Actions[actionIndex % 3] = lastAction;
                                    actionIndex++;
                                } else {
                                    System.out.println("Fadlan geli lacag sax ah.");
                                }
                            } else {
                                System.out.println("Mahadsanid");
                            }
                            break;

                        case 3:
                            System.out.println("Fadlan Gali Lacagta:");
                            int Lacagqaadasho = input.nextInt();

                            System.out.println("Ma hubtaa inaad $" + Lacagqaadasho + " ka qaadatay Account-kaaga?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int HubinLacagQaadasho = input.nextInt();

                            if (HubinLacagQaadasho == 1) {
                                if (Lacagqaadasho > 0 && Lacagqaadasho <= SalaamBankBalance) {
                                    SalaamBankBalance -= Lacagqaadasho;
                                    System.out.println("Waxaa Account-kaaga laga jaray $" + Lacagqaadasho);
                                    System.out.println("Haraaga Salaam Bank waa $" + SalaamBankBalance);
                                    lastAction = "Ka qaadatay $" + Lacagqaadasho + " Salaam Bank";
                                    last3Actions[actionIndex % 3] = lastAction;
                                    actionIndex++;
                                } else {
                                    System.out.println("Haraagaaga kuguma filna.");
                                }
                            } else {
                                System.out.println("Mahadsanid");
                            }
                            break;

                        default:
                            System.out.println("Xulasho khaldan.");
                            break;
                    }
                    break;

                // 7 Mareeynta

                case 7:
                    System.out.println("Mareeynta");
                    System.out.println("1. Bedel lambarka Sirta ah");
                    System.out.println("2. Bedel luuqada");
                    System.out.println("3. Lacag Xirasho");
                    int Mareeynta = input.nextInt();
                    switch (Mareeynta){
                        case 1:
                            System.out.println("Fadlan Gali PIN-Kaaga Cusun ");
                            int New_Pin = input.nextInt();
                            System.out.println("Hubi PIN_Kaaga Cusub");
                            int CheckNew_Pin = input.nextInt();
                            if(New_Pin == CheckNew_Pin)
                                System.out.println("Waad Kuguuleysatay Inaad badasho PIN-ka, PIN-kaaga Cusub Waa " + New_Pin);

                            else
                                System.out.println("Labada PIN_isma lahan, Fadlan Gali PIN isku mid ah.");
                            break;
                        case 2:
                            System.out.println("Fadlan dooro luuqad");
                            System.out.println("1. English");
                            System.out.println("2. Somali");
                            int ChangeLanguage = input.nextInt();
                            switch (ChangeLanguage){
                                case 1:
                                    System.out.println("<-EVCPlus-> Waad Kuguuleysatay inaad Badasho Luuqadaada.");
                                    break;
                                case 2:
                                    System.out.println("<-EVCPlus-> Waad Kuguuleysatay inaad Badasho Luuqadaada.");
                                    break;


                            }
                            break;
                        // lacag xirasho

                        case 3:
                            System.out.println("Fadlan gali Lambakii lagacta lagu qalday");
                            int MistakeNumber = input.nextInt();
                            System.out.println("Fadlan Gali Lamabarka Loorabay");
                            int intendedNumber = input.nextInt();
                            System.out.println("Mahubtaa inaad Xiratay Lacagtaan");
                            System.out.println(" 1. Haa");
                            System.out.println("2. Maya");
                            int hubin = input.nextInt();
                            if(hubin == 1)
                                System.out.println("Waad Kuguuleysatay Lacag xirashaan ");
                            else
                                System.out.println("mahadsanid ");
                            break;

                    }
                    break;



                default:
                    System.out.println("Xulasho Khaldan.");
                    break;
            }

        } else {
            System.out.println("Invalid pin");
        }

        input.close();
    }
}