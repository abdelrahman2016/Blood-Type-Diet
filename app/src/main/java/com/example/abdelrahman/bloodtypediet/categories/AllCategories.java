package com.example.abdelrahman.bloodtypediet.categories;

import android.util.Log;

import com.example.abdelrahman.bloodtypediet.DataFetched;
import com.example.abdelrahman.bloodtypediet.R;
import com.example.abdelrahman.bloodtypediet.Type;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by abdelrahman on 18/11/16.
 */
public class AllCategories {
    String category;
    final String LOG_TAG=AllCategories.class.getSimpleName();
    public AllCategories(String cat){

//ABO

        this.category=cat;
        switch (cat){
            case "meat":this.cat=meat;
                break;
            case "egg":this.cat=egg;
                break;
            case "fish":this.cat=fish;
                break;
            case "oil":this.cat=oil;
                break;
            case "beverage":this.cat=beverage;
                break;
            case "fruit":this.cat=fruit;
                break;
            case "vegetables":this.cat=vegetables;
                break;

            case "grain":this.cat=grain;
                break;

            case "dairy":this.cat=dairy;
                break;

            case "herb":this.cat=herb;
                break;

            case "sweetener":this.cat=sweetener;
                break;

            case "bean":this.cat=bean;
                break;

        }
    }
    public String[] getResult(){
        return cat ;
    }
    public int getType(Type type){
    switch (type){
        case AVOID:return R.drawable.no;
        case NEUTRAL:return R.drawable.neutral;
        case BENEFICIAL:return  R.drawable.yes;
        default: return 0;
    }
    }
    public int getImage(int i,String type){
     if(type.equals("a")){//A type
         switch (category){
             case "meat":return getType(meatA[i]);

             case "egg":return getType(eggA[i]);


             case "fish":return getType(fishA[i]);

             case "oil":return getType(oilA[i]);
             case "beverage":return getType(beverageA[i]);
/*
             case "fruit":return getType(fruitA[i]);
                 break;
*/
/*
             case "vegetables":return getType(vegetablesA[i]);
                 break;
*/

/*
             case "grain":return getType(grainA[i]);
                 break;
*/

             case "dairy":return getType(dairyA[i]);

/*
             case "herb":return getType(herbA[i]);
                 break;
*/

             case "sweetener":return getType(sweetenerA[i]);

             case "bean":return getType(beanA[i]);
                default:return 0;
         }
     }
        else{
         if(type.equals("b")){//B type
             switch (category){
                 case "meat":return getType(meatB[i]);
                 case "egg":return getType(eggB[i]);

                 case "fish":return getType(fishB[i]);
                 case "oil":return getType(oilB[i]);
                 case "beverage":return getType(beverageB[i]);
/*
                 case "fruit":return getType(fruitB[i]);
                 case "vegetables":return getType(vegetablesB[i]);

                 case "grain":return getType(grainB[i]);
*/

                 case "dairy":return getType(dairyB[i]);
//                 case "herb":return getType(herbB[i]);

                 case "sweetener":return getType(sweetenerB[i]);

                 case "bean":return getType(beanB[i]);
                 default:return 0;
             }
         }
         else{
             if(type.equals("ab")){//AB
                 switch (category){
                     case "meat":return getType(meatAB[i]);
                     case "egg":return getType(eggAB[i]);
                     case "fish":return getType(fishAB[i]);
                     case "oil":return getType(oilAB[i]);
                     case "beverage":return getType(beverageAB[i]);
      //               case "fruit":return getType(fruitAB[i]);
    //                 case "vegetables":return getType(vegetablesAB[i]);

        //             case "grain":return getType(grainAB[i]);

                     case "dairy":return getType(dairyAB[i]);

      //             case "herb":return getType(herbAB[i]);

                     case "sweetener":return getType(sweetenerAB[i]);

                     case "bean":return getType(beanAB[i]);
                     default:return 0;
                 }
             }
             else{
                 if(type.equals("o")){//O
                     switch (category){
                         case "meat":return getType(meatO[i]);
                         case "egg":return getType(eggO[i]);
                         case "fish":return getType(fishO[i]);
                         case "oil":return getType(oilO[i]);
                         case "beverage":return getType(beverageO[i]);
//                         case "fruit":return getType(fruitO[i]);
  //                       case "vegetables":return getType(vegetablesO[i]);

    //                     case "grain":return getType(grainO[i]);

                         case "dairy":return getType(dairyO[i]);

//                         case "herb":return getType(herbO[i]);

                         case "sweetener":return getType(sweetenerO[i]);

                         case "bean":return getType(beanO[i]);
                         default:return 0;
                     }
                 }
             }
         }
     }
        return 0;
    }
    public Type type=Type.AVOID;
    private String[] cat;
    public final String[]  meat=new String[]{"Beef ground","Buffalo Meat","Chicken Meat","Chicken Breast","Chicken Drumstick","Chicken Wings","Cornish Hen","Duck"
    ,"Goat","Goose","Grouse","Guinea Hen","Heart (Beef)","Horse","Lamb","Liver","Mutton","Ostrich"
    ,"Partridge","Pheasant","Quail","Rabbit","Pigeon","Squirrel","Sweetbreads","Turkey","Turtle",
    "Veal","Venison"};
    public final Type[]meatA=new Type[]{Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,
            Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL};
    public final Type[]meatB=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,
            Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,Type.AVOID,
    Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID};
    public final Type[]meatAB=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,
            Type.AVOID,Type.AVOID,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID};
    public final Type[]meatO=new Type[]{Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
            Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL};

    public final String[] egg=new String[]{"Caviar (Black or Red)","Chicken Egg (Yolk)","Chicken Egg (White)"
    ,"Chicken Egg (Whole)","Duck Egg (Whole)","Goose Egg (Whole)","Quail Egg (Whole)","Salmon (Roe)"};
    public final Type[]eggA=new Type[]{Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL};
    public final Type[]eggB=new Type[]{Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID};
    public final Type[]eggAB=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID};
    public final Type[]eggO=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID};

    public final String[] fish=new String[]{"Abalone","Anchovy","Bass (Sea)","Bass (Striped)","Beluga","Butterfish","Carp","Catfish",
    "Chub","Clam (Mixed species)","Cod (Atlantic)","Conch","Crab (Blue)","Croaker (Atlantic)",
    "Cusk","Drum (Freshwater)","EEL (Mixed Species)","Flounder Species","Frog","Grouper (Mixed Species)",
            "Haddock","Half moon fish","Halibut (Greenland)","Mackerel (Atlantic)","Mahi mahi","Mullet",
    "Mussel (Blue)","Octopus (Common)","Orange roughy","Oyster (Eastern)",
    "Perch (Ocean)","Pompano (Florida)",
            "Salmon","Sardine ","Scallop (Mixed spices)",
    "Scup","Shad (American)","Shark (Mixed Species)","Shrimp (Mixed Species)","Smelt","Snail","Sturgeon (Mixed Species)","Sucker (White)","Sunfish","Swordfish","Tilapia","Tilefish",
    "Trout (Brook)","Trout (Rainbow)","Tuna","Whitefish (Mixed Species)","Whiting (Mixed Species)"
    ,"Yellowtail (Mixed Species)"};
    public final Type[]fishA=new Type[]{Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,
    Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID};
    public final Type[]fishB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL};
    public final Type[]fishAB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.BENEFICIAL,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID};
    public final Type[]fishO=new Type[]{Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL};


    public final String []dairy=new String[]{"American Cheese","Blue Cheese","Brie Cheese","Butter","Butter Milk"
    ,"Camembert Cheese","Casein","Cheddar Cheese","Cloby Cheese","Cottage Cheese","Cream Cheese","Edam Cheese"
    ,"Emmental Cheese","Farmer Cheese","Feta Cheese","Ghee Butter","Goat Cheese","Gouda Cheese","Gruyere Cheese"
    ,"Jarlsberg Cheese","Kefir","Milk","Monterey Jack Cheese","Mozzarella Cheese","Munster Cheese","Paneer"
    ,"Neufchatel Cheese","Parmesan Cheese","Provolone Cheese","Quark Cheese","Ricotta Cheese","Sour Cream",
    "String Cheese","Swiss Cheese","Whey","Yogurt"};
   public final Type[]dairyA=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL
    ,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL};
    public final Type[]dairyB=new Type[]{Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,
        Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL
    ,Type.BENEFICIAL};
    public final Type[]dairyAB=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    /*Type.BENEFICIAL*/};
    public final Type[]dairyO=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,/*Type.AVOID*/

    };

    public final String []nut=new String[]{"Almond","Almond Cheese","ALmond Milk","Beechnut","Brazilnut","Butternut"
    ,"Cashews","Hazelnut","Flax seed","Hickorynuts","Litchis","Macadamia Nuts","Pecans","Pine Nuts","Poppy Seed",
    "Pumpkin Seed","Sesame Butter","Sunflower seed","Walnut"};
    public final String[]bean=new String[]{"Adzuki Bean","Black Bean","Black Eyed Pea","Cannellini Bean","Roman Bean",
    "Fava bean","Chick Pea","String Bean","Yam Bean","Kidney Bean","Lentils","Lima Bean","Mung Bean","Navy Bean"
    ,"Northern Bean","Peanut","Pinto Bean","Snap","Soy bean","Soy Cheese","Soy flakes","Soy Milk"," Tempeh","Tofu","White Bean"};
    public final Type[]beanA=new Type[]{Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID
    ,Type.BENEFICIAL,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.NEUTRAL,
    Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,
    Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL};
    public final Type[]beanB=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.BENEFICIAL,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.NEUTRAL};
    public final Type[]beanAB=new Type[]{Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.BENEFICIAL,
    Type.NEUTRAL,Type.BENEFICIAL,Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,
    Type.BENEFICIAL,Type.NEUTRAL};
    public final Type[]beanO=new Type[]{Type.BENEFICIAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.NEUTRAL,Type.NEUTRAL};

    public final String[] oil=new String[]{"Almond Oil","Avocado Oil","Canola Oil",
    "Coconut Oil","Cod Liver Oil","Corn Oil","Cotton Seed Oil","FLax Seed Oil","Olive Oil","Peanut Oil",
    "Safflower Oil","Sesame Oil","Soy Oil","Sunflower Oil","Walnut Oil","Wheat Germ Oil"};
    public final Type[] oilA=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.BENEFICIAL,Type.BENEFICIAL,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,
    Type.BENEFICIAL,Type.NEUTRAL};
    public final Type[] oilB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL};
    public final Type[] oilAB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL};
    public final Type[] oilO=new Type[]{Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,
    Type.AVOID,Type.BENEFICIAL,Type.BENEFICIAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.AVOID};

    public final String[] grain=new String[]{"Amaranth","Barely","Corn","Buckwheat","Couscous",
    "Ezekiel Bread","Gluten Flour","Gluten Free Bread","Kamut","Millet","Oat Flour","Oats","Quinoa","Rice Bean"
    ,"Rice Cakes","Rice","Rice Milk","Rice White","Rye Bread","Rye Flour","Soba Noodles","Sorghum"
    ,"Soy Flour","Spelt","Spelt Flour","Teff","Wheat","Wheat Bread","Wheat Gluten FLour","Whole Wheat"};
    public final String[] vegetables =new String[]{"Agar","Sprouted","ALoe","Artichoke","Arugula","Asparagus",
            "Asparagus Pea","Bamboo Shoots","Beet","Beet Greens","Bok Choy","Broccoli","Brussels Sprouts",
            "Cabbage","Capers","Carrot","Carrot Juice","Cauliflower","Celeriac","Celery",
            "Chicory Roots","Collard Greens","Cucumber","Daikon Radish","Eggplant","Endive"
    ,"Garlic","Ginger Root","Kale","Kelp","Kohlrabi","Leeks","Lettuce","Mushroom","Mustard Green","Olives"
            ,"Oyster","Parsnips","Pea","Peppers","Pickle","Pimento","Poi","Sweet Potato"
            ,"Potatoes","Pumpkin","Radish","Radicchio","Rhubarb","Sauerkraut","Seaweed","Shallots",
            "Spinach","Squash","Swiss Chard","Taro","Tomatoes","Turnips","Water Chestnuts","Yam","Yucca"};
    public final String[]fruit=new String[]{"Apples","Apricots","Asian Pear","Avocado","Bananas","Bitter Melon","Blackberries"
    ,"Blueberries","Breadfruit","Cantaloupe","Casaba Melon","Cherries","Cherry Juice",
            "Coconut Meat","Coconut Milk","Cranberries","Cranberry Juice","Currants","Dates",
    "Elderberries","Figs","Gooseberries","Grape","Grapefruit Juice","Grapefruit","Guava","Kiwi Fruit",
    "Kumquats","Loganberries","Mangos","Mulberries","Oranges","Papayas","Peaches","Pears","Persian","Persimmons","Pineapple","Plantains","Plums"
            ,"Pomegranates","Prickly Pears","Prunes","Quinces","Raisins","Raspberries",
            "Starfruit","Strawberries","Tangerines","Watermelon"};
 public final String[]beverage=new String[]{"Coffee","Green Tea","Soda","Tea"};
    public final Type[] beverageA=new Type[]{Type.BENEFICIAL,Type.BENEFICIAL,Type.AVOID,Type.AVOID};
    public final Type[] beverageB=new Type[]{Type.NEUTRAL,Type.BENEFICIAL,Type.AVOID,Type.NEUTRAL};
    public final Type[] beverageAB=new Type[]{Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID};
    public final Type[] beverageO=new Type[]{Type.AVOID,Type.BENEFICIAL,Type.AVOID,Type.AVOID};

    public final String []sweetener=new String[]{"Agave Syrup","Almond Extract","Aspartame","Barley Malt Flour",
            "Corn Syrup","Dextrose","Fructose","Honey","Invert Sugar","Maltodextrin","Maple Syrup","Molasses","Rice Syrup",
    "Stevia","Sucanat","Sugar"};

    public final Type[] sweetenerA=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL
    ,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.BENEFICIAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL};
    public final Type[] sweetenerB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.NEUTRAL,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL};
    public final Type[] sweetenerAB=new Type[]{Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL};
    public final Type[] sweetenerO=new Type[]{Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.AVOID,
    Type.NEUTRAL,Type.AVOID,Type.AVOID,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.NEUTRAL,Type.AVOID,Type.NEUTRAL};

    public final String[] herb=new String[]{"Allspice","Anise Seed","Arrowroot FLour","Basil","Bay Leaf","Bergamot","Caraway Seed"
    ,"Cardamom","Carob Flour","Chervil","Chili Powder","Chives","Chocolate","Cilantro","Cinnamon","Cloves","Coriander",
    "Cornstarch","Cream of Tartar","Cumin Seed","Curry Powder","Dill Seed","Dulse","Guarana","Mace"
    ,"Marjoram","Mustard","Nutmeg","Oregano","Parprika","Parsley","Pepper Black/White","Rosemary","Saffron","Sage",
    "Savory","Spearmint","Tarragon","Thyme","Turmeric","Vanilla Extract"};

/*
    public String[] getMeat(){
        return meat;
    }
    public String[] getEgg(){
        return egg;
    }
    public String[] getFish(){
        return fish;
    }
    public String[] getDairy(){
        return dairy;
    }
    public String[] getNut(){
        return nut;
    }
    public String[] getBean(){
        return bean;
    }
    public String[] getBeverage(){
        return beverage;
    }

    public String[] getOil(){
        return oil;
    }

    public String[] getGrain(){
        return grain;
    }

    public String[] getVegetables(){
        return vegetables;
    }

    public String[] getFruit(){
        return fruit;
    }

    public String[] getHerb(){
        return herb;
    }

    public String[] getSweetener(){
        return sweetener;
    }*/
}
