
public class GajunFactoryMain {
    public static void main(String[] args) {
        System.out.println("가전제품공장");
        GajunTv tv1 = new GajunTv();
        GajunTv tv2 = new GajunTv();
        GajunTv tv3 = new GajunTv();


        GajunAudio audio1 = new GajunAudio();
        GajunAudio audio2 = new GajunAudio();

        GajunSmartPhone phone1 = new GajunSmartPhone();
        GajunSmartPhone phone2 = new GajunSmartPhone();


        GajunOnOff gajun1 = tv1;


        GajunOnOff[] gajunArr =new GajunOnOff[7];



        gajunArr[0] =gajun1;
        gajunArr[1] = tv1;
        gajunArr[2] = tv2;
        gajunArr[3] = tv3;
        gajunArr[4] = audio1;
        gajunArr[5] = audio2;
        gajunArr[6] = phone1;


        GajunOnOff[] receiveGajunArr = gajunArr;


//        for (GajunOnOff gajunOnOff : receiveGajunArr) {
//            gajunOnOff.on();
//            GajunVolume temp = (GajunVolume) gajunOnOff;
//            temp.volumeUp();
//            gajunOnOff.on();
//            ((GajunVolume) gajunOnOff).volumeDown();
//
//        }

        GajunGumsa gajunGumsa = new GajunGumsa();
        gajunGumsa.setGajuns(gajunArr);
        gajunGumsa.gumsa();


        /*
         * 난 절대로 자식클래스타입을 사용안할래요
         * 난 부모타입[GajunVolume,GajunOnOff]만 사용할래요
         * 그래야 가전제품검사 프로그램을 한번만들어서 변경없이
         * 계속사용할수있으니까요~~
         */
    }
}
