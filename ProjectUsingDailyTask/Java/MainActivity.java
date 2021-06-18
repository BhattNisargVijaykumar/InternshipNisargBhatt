package com.example.taskuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.taskuse.adapter.MyAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_ADD_NOTE = 1;
    ImageView ima1,ima2,ima3;
    ListView lv1;
    int[] image={R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth,R.drawable.ic_launcher_foreground,R.drawable.sixth,R.drawable.seventh,R.drawable.eight,R.drawable.nine,R.drawable.tenth,R.drawable.eleventh,R.drawable.twelveth};
    String[]name= {"India-bound vaccine 90% effective","A fourth of Covid tests during Kumbh were fake","CPI inflation breaches RBI's comfort band","Day after flagging mafia threat, scribe dead in ‘accident’","After Tata Group & RIL, which is the third Indian conglomerate to cross $100 bn in market cap?","Lakshadweep: Filmmaker seeks anticipatory bail in sedition case","Rebellion in the LJP ranks","What a ‘speedy’ monsoon means for India","The men who wield power in new Israel","Cancelled board exams: CBSE panel yet to submit report on...","California reopens, says goodbye to most Covid-19 rules","G7 pledge 1 billion vaccine doses to poorer nations: Boris Johnson"};
    String[]description={"The Covid-19 vaccine developed by US biotech firm Novavax — which India's Serum Institute is making — has shown 90.4% efficacy in a large late-stage trial held in the U.S. and Mexico, the company said on Monday. "+"\n " +"Variants of virus: The analysis was conducted from January 25 through April 30, 2021 — a time when the Alpha (B.1.1.7) variant, first identified in the U.K., became the predominant strain in the U.S. Including other Variants of Interest (VoI) and Variants of Concern (VoC), which represented 82% of the cases, vaccine efficacy was 93.2%.\n" +
            "\n" +
            "When to expect? The data will be shared with regulators including the US FDA “in the third quarter, upon completion of the final phases of process qualification and assay validation needed to meet chemistry, manufacturing and controls (CMC) requirements”, the company said." +
            "The rollout in India is dependent on clearance of the US FDA. Serum Institute, one of the many contract manufacturers of the vaccine, has said it has already begun production of the doses at risk.\n" +
            "\n" +
            "The science: Novavax harvests a version of the spike proteins to make the subunit protein vaccine.\n" +
            "First, the vaccine makers load genetic material associated with the coronavirus spike protein into baculovirus.\n" +
            "This baculovirus is then inserted into moth cells. The infected moth cells then produce spike proteins.\n" +
            "These nano-sized spike proteins are then harvested and processed, and mixed with adjuvants to make the vaccine."
            ,"An investigation by the Uttarakhand health department has found that at least 1 lakh test reports issued during the Kumbh festival in Haridwar were fake and forged by a private agency, reports TOI.\n" +
            "In one instance, a single phone number was used to register over 50 people while one antigen test kit (which has an exclusive number and is meant for single use) was shown to have tested 700 samples. Addresses and names were fictional too and a single house was shown to have collected 530 samples, an official who is part of the investigation told TOI.\n" +
            "The 200 sample collectors employed by the agency turned out to be students and data entry operators in Rajasthan, who had never been to Haridwar.\n" +
            "The agency was paid Rs 350 per antigen test and higher for RT-PCR tests, which means the scam runs into crores.\n" +
            "According to officials, this is “just the tip of the iceberg” since eight more sample collection agencies were tasked to conduct tests by the state government after the high court directed Uttarakhand to carry out at least 50,000 tests daily during Kumbh. The festival was held from April 1 to 30 in Haridwar.\n" +
            "The four lakh tests in this period were conducted by nine agencies and 22 private labs. Majority of these tests were antigen tests. The state department also conducted its own tests through government labs.\n" +
            "Of the 1 lakh tests conducted by the agency under scanner, 177 were “Covid positive” — a positivity rate of only 0.18%. In contrast, the positivity rate in Haridwar in April went upto 10%.\n" +
            "The scam came to light earlier this week after a Punjab-based man — who had not visited Kumbh— received a Covid-negative report on his phone from the Haridwar health department. He filed a complaint with the Indian Council of Medical Research which alerted the state authorities.","Retail inflation rose in May, exceeding the RBI Monetary Policy Committee's upper tolerance limit for the first time since November.\n" +
            "Consumer Price Index inflation rose to 6.3% in May 2021 — a six-month high — compared with 4.23% in April, according to data released by the Ministry of Statistics and Program Implementation on Monday.\n" +
            "The RBI was mandated to maintain the crucial number at 4% in the medium term, with a 2 percentage point margin on either side as part of its inflation target.\n" +
            "On a monthly basis, the index rose by 1.65%, climbing to 160.4 in May from 157.8 in April.\n" +
            "Food inflation accelerated to 5.01% in May, compared with 1.96% in April, while core inflation, which excludes food, fuel and light, stood at 6.6%. Within the food items, the rate of fall in vegetables prices was at -1.92% in May, against -14.18% in the previous month.\n" +
            "Inflation in 'fuel and light' category remained elevated at 11.58% during the month versus 7.91% the previous month.\n" +
            "Also: Wholesale price-based inflation, released earlier during the day, soared to a record high of 12.94% in May, on rising prices of crude oil and manufactured goods.\n" +
            "There may be fewer supply chain disruptions during the recent pandemic lockdowns compared with last year, but a general rise in inflation globally has elevated domestic price pressures. Higher global commodity prices including crude, edible oils and gold are spilling over into consumer inflation.","A news channel reporter, who had recently run a story exposing the wrongdoings of the liquor mafia in Uttar Pradesh, was on Sunday night found dead under “mysterious circumstances”.\n" +
            "Pratapgarh-based Sulabh Srivastava was found dead just a day after he had written to ADG-Prayagraj Prem Prakash that his life was under threat and sought protection. In his letter, Srivastava had said that he was being followed by some unknown persons whenever he ventured out of his house.\n" +
            "His wife Renuka Srivastava, in her police complaint said that her husband was being threatened for doing a story against the liquor mafia and the ADG-Prayagraj was informed about it in writing. “Because of this, unknown mafia elements murdered my husband on Sunday night while he was returning from Lalganj after news coverage,” she said in her complaint. She also stated that the crime was dressed up in a manner to make it look like a road accident.\n" +
            "Police have registered a case of murder on the complaint of his wife. The ADG said that the “threat” angle would be probed and action taken accordingly.\n" +
            "The incident saw opposition leaders including AICC general secretary Priyanka Gandhi Vadra, Samajwadi Party chief Akhilesh Yadav and Trinamool Congress president Mamata Banerjee take to Twitter to attack the Yogi Adityanath government over the law and order situation in the state. The Editors Guild of India, too, issued a statement criticising the UP Police for not taking Srivastava’s complaint seriously.","Clue 1: Its chairman is the second-richest man in India, with a net worth of $77 billion, per Bloomberg Billionaires Index.\n" +
            "Clue 2: Founded in 1988, it is headquartered in Ahmedabad.\n" +
            "Clue 3: It is India's largest port developer and operator with 1o ports and terminals.","Filmmaker and activist Aisha Sultana has approached the Kerala High Court seeking anticipatory bail after the Lakshadweep authorities charged her with sedition for her critical remarks of Praful Patel, the administrator of the union territory.\n" +
            "\n" +
            "In her bail plea, Sultana cited the recent observations the Supreme Court made while quashing sedition charges against journalists Vinod Dua in another case to say \"a citizen has a right to criticize or comment upon the measures undertaken by the Government and its functionaries... \".\n" +
            "The sedition charges were filed against Sultana, a native of Lakshadweep's Chetlat island, after she, in an interview, called Patel a \"bioweapon\", referring to the rise in cases in the atoll following his decision to do away with mandatory quarantine.\n" +
            "Praful Patel, a former home minister of Gujarat, meanwhile, evaded the awaiting protesters at the Cochin airport, Kerala, by flying into the archipelago via Goa, even as the islanders observed Black Day protests from the confinements of their homes — a lockdown is in place.\n" +
            "\n" +
            "This was Patel's first visit since the controversial draft rules were forwarded to the Union government.\n" +
            "His arrival also coincides with a spate of resignations by the local BJP leaders protesting against the sedition charges against Sultana.","Less than a year after the death of Lok Janshakti Party (LJP) founder Ramvilas Paswan, the party has imploded from within. Five of its six Lok Sabha MPs have come out against his son and current party president Chirag Paswan.\n" +
            "\n" +
            "Who? These include Chirag’s uncle Pashupati Nath Paras (a first-time MP from Hajipur), cousin Prince Raj (Samastipur, and LJP's Bihar president), Chandan Singh (Nawada), Veena Devi (Vaishali) and Mehboob Ali Kaiser (Khagaria). The five have written to Lok Sabha Speaker Om Birla, asking him to recognise Paras as the leader of the parliamentary party instead of Chirag.\n" +
            "Why? Differences in the party had arisen ahead of the Bihar Assembly polls held in October-November last year. Many party members, including Paras and Kaiser, questioned Chirag’s strategy of contesting alone outside the National Democratic Alliance (NDA) alliance, pitching a direct battle against Bihar CM Nitish Kumar and the Janata Dal (United).\n" +
            "Though the LJP could win only one seat, it inflicted serious damage on the JD(U), who finished third in the Bihar polls, behind BJP and RJD.\n" +
            "Also, LJP's only MLA joined JD(U) in April this year.\n" +
            "Now what? Paras said his group will continue to be part of the BJP-led NDA in Bihar, adding Chirag can remain part of the organisation.\n" +
            "The move also comes just ahead of an expected Cabinet reshuffle at the Centre. Paras is hopeful of getting the post that fell vacant on the death of brother Ramvilas. Read the LJP wants to be part of the governments at the Centre and in Bihar.","Despite a late onset over Kerala, the monsoon has picked up speed and has already covered two-thirds of the country, nearly a fortnight ahead of schedule. In fact, according to the Indian Meteorological Department (IMD) the national capital Delhi is likely to receive its first monsoon showers today, instead of its usual date of June 27.\n" +
            "\n" +
            "Soon enough?\n" +
            "The last time Delhi received monsoon showers this early was 13 years back in 2008, when the monsoon onset was on June 15. Parts of Punjab in fact have already received monsoon showers, where it usually enters in the last week of June.\n" +
            "In fact, the two major agrarian states of Punjab and Haryana have received excess rainfall since the start of June — as against the normal rainfall of 14.7 mm for the period June 1-14, Punjab has already received 38 mm of rainfall, which is an excess of 158% while Haryana has received 33.7 mm of rain against a normal of 13.7 mm, which is excess by 146%.\n" +
            "Even Himachal Pradesh, which usually receives 33.5 mm rainfall for this period, has already received 42.2 mm of rainfall — an excess of 26%.\n" +
            "Implications\n" +
            "A direct impact of an early monsoon will be in the states of Punjab and Haryana, where sowing of paddy before May 10 is forbidden by law and transplanting usually happens around June 20. Given the excess rains, it could reduce the consumption of groundwater in both these states.\n" +
            "This year, while paddy transplanting in Punjab commenced on June 10, in Haryana it was scheduled to start from today but farmers have already started transplanting it from last week as the saplings were ready in the nurseries.\n" +
            "However, an early monsoon could have pitfalls for north India’s pollution levels. That’s because an early arrival could imply an early withdrawal, which means that in the absence of a retreating monsoon, the pollution levels could start rising earlier this year, coupled with the crop burning that happens in mid-October.","A new government took charge in Israel late on Sunday, formally ending the reign of Benjamin Netanyahu, the longest-serving prime minister of the country.\n" +
            "\n" +
            "The men — they are mainly men — who took power are from eight parties across the political spectrum, with contrasting economic and socio-political ideologies, united by the will to oust Netanyahu. Key figures:\n" +
            "\n" +
            "Naftali Bennett is the new Prime Minister of this coalition government. A right-wing ideologue and a former settlement leader, his party had won only 7 seats in the 120-member parliament (Knesset) but was crucial for the coalition to get the 60-mark.\n" +
            "Yair Lapid, a former journalist turned centrist politician, is the architect of the coalition, his party having won 17 seats, second only to Netanyahu's Likud. But Lapid will serve as the foreign minister under Bennett for the first two years, and the two will then swap their roles in 2023.\n" +
            "Avigdor Lieberman, who lives in an illegal Israeli settlement in the occupied West Bank, is the new finance minister.\n" +
            "Benny Gantz, a rival-turned-ally of Netanyahu has entered his party into the new coalition, retaining his post as the defence minister.\n" +
            "Mansour Abbas has not joined the cabinet but his Islamist Ra'am party, backed by the Palestinian citizens in Israel, is crucial to the alliance. The relations — and friction — between Abbas and leaders such as Lieberman could well decide the fate of the alliance.","NEW DELHI: A CBSE constituted panel is yet to submit its recommendations for the criteria to evaluate class 12 students whose exams have been cancelled in view of the Covid-19 pandemic, according to sources.\n" +
            "\n" +
            "The 13-member panel, set up by the board for the purpose, was supposed to submit its report by Monday. However, it is likely to take a few more days for finalising the criteria.\n" +
            "\n" +
            "\"The panel has not submitted its report. Widespread discussions have been held to come up with a fair and objective criteria. The final recommendations will be submitted soon,\" a source said \"Most panel member are in favour of giving weightage to class 10 and 11 scores besides pre board and internal exams for class 12. However, a final call is yet to be taken and the report will be submitted in a few days,\" the source added.\n" +
            "The Supreme Court on June 3 granted the central government two weeks time to devise a well-defined objective criteria for assessment of Class 12.\n" +
            "\n" +
            "The CBSE had on June 4 constituted a 13-member committee to work out the criteria. The panel was given ten days to submit its report.\n" +
            "Delhi Deputy Chief Minister Manish Sisodia has also written to Union Education Minister Ramesh Pokhriyal 'Nishank' suggesting that the result for class 12 students, whose exams were cancelled due to the Covid-19 pandemic, should be tabulated taking into account the marks scored during class 10, 11 and pre-board exams.\n" +
            "\n" +
            "The government on June 1 cancelled the CBSE class 12 board exams amid the continuing pandemic across the country, with Prime Minister Narendra Modi asserting that the decision was taken in the interest of students, and the anxiety among students, parents and teachers must be put to an end.\n" +
            "\n" +
            "The decision was taken at a high-level meeting chaired by Modi in which it was decided that the CBSE will take steps to compile the results of Class 12 students according to a well-defined objective criteria in a time-bound manner.\n" +
            "\n" +
            "It was also decided in the meeting that in case some students desire to take the exams, such an option would be provided to them by the CBSE as and when the situation becomes conducive.\n" +
            "\n" +
            "The exams were scheduled to be conducted in May-June and were postponed in view of the second wave of the pandemic. The CBSE had already cancelled class 10 board exams and announced an alternative marking policy.\n" +
            "\n" +
            "\n" +
            "According to the policy, while 20 marks for each subject will be for internal assessment as every year, 80 marks will be calculated on basis of the students' performance in tests or exams throughout the year.\n" +
            "\n" +
            "The weightage in terms of maximum marks for schools which have conducted the tests and exams through the year will be -- periodic test/unit test (10 marks), half-yearly exam (30 marks) and pre-board exams (40 marks).\n" +
            "\n" +
            "\n" +
            "For class 10, schools have been asked to submit the tabulated marks by June 30 and the result is expected to be declared in July.","SAN FRANCISCO: California, the first state in America to put in place a coronavirus lockdown, is now turning a page on the pandemic.\n" +
            "At the stroke of midnight, California is lifting most of its Covid-19 restrictions and ushering in what has been billed as the state's ``Grand Reopening.''\n" +
            "Starting Tuesday, there will be no more state rules on social distancing, and no more limits on capacity at restaurants, bars, supermarkets, gyms, stadiums or anywhere else. And masks- one of the most symbolic and fraught symbols of the pandemic - will no longer be mandated for vaccinated people in most settings, though businesses and counties can still require them. Just in time for summer, California wants to send the message that life in the Golden State is getting much closer to normal. The economy is fully reopening for the first time in 15 months and people can largely return to pre-pandemic lifestyles. Fans can cheer mask-less at Dodgers and Giants games. Disneyland is throwing its doors open to all tourists after allowing just California residents. People can pack indoor bars and nightclubs from the Sunset Strip in Los Angeles to the Castro in San Francisco.\n" +
            "\n" +
            "``With all due respect, eat your heart out, the rest of the United States. There is no state in America that has more,'' Gov. Gavin Newsom said on the eve of the reopening. ``The state is not just poised to recover, it's poised to come roaring back.''\n" +
            "\n" +
            "To mark the reopening, Newsom will make a few lucky residents millionaires. In a made-for-TV main event, the governor will draw 10 names of residents who have received at least one vaccine dose and award each one $1.5 million. The drawing is the grand finale to the nation's largest vaccine incentive, $116 million in a Covid-19 vaccine lottery. Winners can collect the money once they're fully vaccinated.\n" +
            "\n" +
            "Officials want tourists back, too.","CARBIS BAY (UK): British Prime Minister Boris Johnson says the G7 countries have pledged over 1 billion coronavirus vaccine doses for poorer nations.\n" +
            "\n" +
            "Speaking at the end of a G-7 leaders' summit in southwest England on Sunday, Johnson said the doses would come both directly and through the international COVAX programme.\n" +
            "\n" +
            "The commitment falls far short of the 11 billion doses the World Health Organisation said is needed to vaccinate at least 70% of the world's population and truly end the pandemic."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageProfile = findViewById(R.id.imageProfile);
        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(
                        new Intent(getApplicationContext(), Profile_Sp.class),
                        REQUEST_CODE_ADD_NOTE
                );
            }
        });

        lv1=findViewById(R.id.listview);
        MyAdapter myAdapter=new MyAdapter( MainActivity.this,image, name,description);
        lv1.setAdapter(myAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,ListViewDetailPage.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                intent.putExtra("description",description[position]);
                startActivity(intent);
            }
        });

        ima1=findViewById(R.id.imageList);
        ima1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ima2=findViewById(R.id.imageGrid);
        ima2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewNews.class);
                startActivity(intent);
            }
        });

        ima3=findViewById(R.id.imageContactUs);
        ima3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactUs.class);
                startActivity(intent);
            }
        });

    }
}