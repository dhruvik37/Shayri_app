package com.example.shayri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var text :TextView
    lateinit var card22:ListView

    var Morning = arrayOf("मुस्कुराहट का कोई मोल नही होता है, रिश्तों का कोई तोल नही होता है, इंसान तो मिल जातें है हमे हर मोड़ पर, लेकिन हर कोई आप की तरह अनमोल नही होता है।"
                        ,"पलके झुका कर सलाम करते हैं, हम तह दिल से आपके लिए दुआ करते हैं, कुबूल हो तो बस मुस्कुरा देना, हम ये प्यारा सा दिन आपके नाम करते हैं।"
                        ,"खुशबू बन कर मेरी सांसो में रहना, लहू बन कर मेरी रग रग में बहना, दोस्त होते हैं रिश्तों का अनमोल गहना, इसलिये हर रोज़ सुबह हम से Good Morning कहना।"
                        ,"दिल ने कहा कोई याद कर रहा है, मैंने सोचा दिल मज़ाक कर रहा है, फिर आईं हिचकी मैंने सोचा,अपना ही कोई मैसेज का इंतज़ार कर रहा है।"
                        ,"सुबह-सुबह आपकी यादों का साथ हो,\n" +
                        "मीठी-मीठी परिंदों की आवाज़ हो,\n" +
                        "आपके चेहरे पर हमेशा मुस्कुराहट हो,\n" +
                        "और हमारी ज़िन्दगी में सिर्फ आपका साथ हो।")
    var night = arrayOf("दुनिया को हर वक़्त खुशी चाहिए,\n" +
                        "लेकिन हमें हर खुशी में,\n" +
                        "सिर्फ आप जैसे दोस्त चाहिए।\n" +
                        "||शुभ रात्रि||","कोई चाँद सितारा हैं,\n" +
                        "तो कोई फूल से भी प्यारा हैं,\n" +
                        "जो हर पल याद आए,\n" +
                        "वो पल पल सिर्फ तुम्हारा हैं..\n" +
                        "||शुभ रात्रि||","मेसेज का जवाब मैसेज से दीजिए,\n" +
                        "हम भी आपके गुड नाईट का इंतज़ार कर रहे हैं,\n" +
                        "कृपया रिप्लाई तो कीजिए..\n" +
                        "||शुभ रात्रि||","मुस्कुराओ क्या गम हैं ज़िंदगी में,\n" +
                        "टेंशन किसको कम हैं ज़िंदगी में,\n" +
                        "अच्छा बुरा सब भ्रम हैं ज़िंदगी में,\n" +
                        "क्योंकि कभी खुशी कभी गम हैं ज़िंदगी में…\n" +
                        "||शुभ रात्रि||","बादल चाँद को छुपा सकता हैं,\n" +
                        "आकाश को नहीं,\n" +
                        "हम सभी को भुला सकते हैं,\n" +
                        "बस आपको नहीं…\n" +
                        "||शुभ रात्रि||")
    var Brithday = arrayOf("माँ की दुआ न बाप की शफ़क़त का साया है \n" +
                        "\n" +
                        "आज अपने साथ अपना जनम दिन मनाया है ","तुम सलामत रहो हज़ार बरस \n" +
                        "\n" +
                        "हर बरस के हों दिन पचास हज़ार ","कुछ ख़ुशियाँ कुछ आँसू दे कर टाल गया \n" +
                        "\n" +
                        "जीवन का इक और सुनहरा साल गया ","ये तो इक रस्म-ए-जहाँ है जो अदा होती है \n" +
                        "\n" +
                        "वर्ना सूरज की कहाँ सालगिरह होती है ","हसीन चेहरे की ताबिंदगी मुबारक हो \n" +
                        "\n" +
                        "तुझे ये साल-गिरह की ख़ुशी मुबारक हो ")
    var Friend = arrayOf("ज़िन्दगी हर पल कुछ खास नहीं होती,\n" +
                        "फूलों की खुशबू हमेशा पास नहीं होती,\n" +
                        "मिलना हमारी तक़दीर में था वरना,\n" +
                        "इतनी प्यारी दोस्ती इत्तेफाक नहीं होती।\n" +
                        "\n" ,"तुम दोस्त बनके ऐसे आए ज़िन्दगी में,\n" +
                        "कि हम ये जमाना ही भूल गये,\n" +
                        "तुम्हें याद आए न आए हमारी कभी,\n" +
                        "पर हम तो तुम्हें भुलाना ही भूल गये।\n" +
                        "\n" ,"ज़िन्दगी के तूफानों का साहिल है दोस्ती,\n" +
                        "दिल के अरमानों की मंज़िल है दोस्ती,\n" +
                        "ज़िन्दगी भी बन जाएगी अपनी तो जन्नत,\n" +
                        "अगर मौत आने तक साथ दे दोस्ती।\n" +
                        "\n","दुश्मनों से मोहब्बत होने लगी है मुझे,\n" +
                        "जैसे-जैसे दोस्तों को आजमाता जा रहा हूँ।\n" +
                        "\n","दाग दुनिया ने दिए ज़ख्म ज़माने से मिले,\n" +
                        "हमको तोहफे ये तुम्हें दोस्त बनाने से मिले।\n" +
                        "\n")
    var Attitude = arrayOf("आज हमलोग इस शायरी discussion में attitude shayari से संबंधित कुछ बेहतरीन शायरीयाँ आपके लिए लाए हैं।इस शायरी में जोश, जुनून से भर देने वाले शायरी का पूरा collection हैं।यदि आप शायरी सुनने और शेयर करने के शौकीन हैं हैं तो आप attitude shayari सुनने के भी शौकीन होंगे।"
                        ,"अपनी प्रतिद्वंदी या दुश्मन को अपने रुतबे व अपनी शक्ति को दर्शाने में attitude shayari काफी कारगर हैं।किसी को अपनी power को दर्शाने में attitude shayari काफी कारगर हैं।चलिये attitude shayari in hindi के पूरे collection देखते हैं।"
                        ,"भाड़ में जाये लोग ओर,\n" +
                                    "लोगो की बातें,\n" +
                                    "हम वैसे ही जियेंगे,\n" +
                                    "जैसे हम है चाहते..","वो जिगर ही नहीं,\n" +
                                    "जिसमे दम न हो,\n" +
                                    "बेटा अगर तू बदमाश है,\n" +
                                    "तो हम भी कम नहीं…","अब न रिप्लाई चाहिए,\n" +
                                    "न ही तेरा साथ,\n" +
                                    "तू प्लीज अपना ध्यान रख,\n" +
                                    "मुझे नही करनी तुझसे बात…")
    var blank = arrayOf<String>("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        text=findViewById(R.id.textt)
        card22=findViewById(R.id.crad22)



        var position=intent.getStringExtra("dk")

        text.setText(position)

        if (position.equals("Morning Shayri")){
            blank=Morning
        }else if (position.equals("Night Shayri")){
            blank=night
        }else if (position.equals("Brithday Shayri")){
            blank=Brithday
        }else if (position.equals("Friend Shayri")){
            blank=Friend
        }else if(position.equals("Attitude Shayri")){
            blank=Attitude
        }


        var dhruvik= Class2(this,blank)

        card22.adapter=dhruvik

        card22.setOnItemClickListener { parent, view, pos, idd ->

            var secondveiw =Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(secondveiw.putExtra("name",blank[pos]).putExtra("array",blank).putExtra("pos",pos))


        }




    }

}