package com.mashy.tp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        // Look up the Recycler View in layout
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        //initialisation des contacts
        contacts.add(new Contact("Jean","Pierre","https://photos.tf1.fr/700/933/cover-jean-pierre-pernaut-jt-13h-58f17c-0@1x.jpg"));
        contacts.add(new Contact("Jeanne","D'arc","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Pierre","Menez","https://resize-parismatch.lanmedia.fr/img/var/news/storage/images/paris-match/culture/medias/documentaire-sur-le-sexisme-pierre-menes-exprime-ses-regrets-et-fait-son-mea-culpa-1731269/28535945-1-fre-FR/Documentaire-sur-le-sexisme-Pierre-Menes-exprime-ses-regrets-et-fait-son-mea-culpa.jpg"));
        contacts.add(new Contact("Arthur","Rimbaud","https://upload.wikimedia.org/wikipedia/commons/1/1c/Rimbaud.PNG"));
        contacts.add(new Contact("Richard","Couer de Lion","https://images.lanouvellerepublique.fr/image/upload/t_1020w/f_auto/58c2c255479a454c008b4966.jpg"));
        contacts.add(new Contact("Zinedeine","Zidane","https://le10static.com/img/master/0000/0018/187965.jpeg"));
        contacts.add(new Contact("Yannick","Noah","https://static1.purepeople.com/articles/7/31/07/57/@/4400456-exclusif-yannick-noah-enregistrement-624x600-2.jpg"));

        ContactsAdapter adapter = new ContactsAdapter(contacts,getApplicationContext());

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));


    }
}