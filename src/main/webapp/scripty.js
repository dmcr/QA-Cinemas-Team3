



    function myFunction() {

        document.getElementById("myDropdown").classList.toggle("show");
    }

// Close the dropdown if the user clicks outside of it
    window.onclick = function(e) {

        if (!e.target.matches('.dropbtn')) {

            var dropdowns = document.getElementsByClassName("dropdown-content");
            for (var d = 0; d < dropdowns.length; d++) {
                var openDropdown = dropdowns[d];
                if (openDropdown.classList.contains('show')) {
                    openDropdown.classList.remove('show');
                }
            }
        }
    }













function unhideDiv(){
alert("second function");
    document.getElementById("paragraph").style.cssText = "opacity:0;";

}



var firstclick = 0;


function DarkenComingSoon(){

    if(firstclick == 0){



        $("div").removeClass("row3");
        $("div").addClass("row4");
        firstclick++;
    }
    else if(firstclick == 1){


        $("div").removeClass("row4");
        $("div").addClass("row3");

        firstclick++;
    }


    document.getElementById('coming-soon1').style.cssText = 'opacity:0.5;';
    document.getElementById('coming-soon2').style.cssText = 'opacity:0.5;';
    document.getElementById('whats-on1').style.cssText = 'opacity:1;';
    document.getElementById('whats-on2').style.cssText = 'opacity:1;';



    document.getElementById('whats-on1').style.cssText = 'text-decoration : underline;';
    document.getElementById('whats-on2').style.cssText = 'text-decoration : underline;';



    document.getElementById('image1').style.cssText = 'opacity:1;';
    document.getElementById('image2').style.cssText = 'opacity:1;';
    document.getElementById('image3').style.cssText = 'opacity:1;';
    document.getElementById('image4').style.cssText = 'opacity:1;';
    document.getElementById('image5').style.cssText = 'opacity:1;';
    document.getElementById('image6').style.cssText = 'opacity:1;';
    document.getElementById('image7').style.cssText = 'opacity:1;';
    document.getElementById('image8').style.cssText = 'opacity:1;';

    document.getElementById('image9').style.cssText = 'opacity:0;';
    document.getElementById('image10').style.cssText = 'opacity:0;';
    document.getElementById('image11').style.cssText = 'opacity:0;';
    document.getElementById('image12').style.cssText = 'opacity:0;';
    document.getElementById('image13').style.cssText = 'opacity:0;';
    document.getElementById('image14').style.cssText = 'opacity:0;';
    document.getElementById('image15').style.cssText = 'opacity:0;';
    document.getElementById('image16').style.cssText = 'opacity:0;';




    document.getElementById("WhatsOnRow").setAttribute("style" , "width:100%");



}

var CSfirstclick = 0;

function DarkenWhatsOn(){


    if(firstclick == 0){

        $("div").removeClass("row3");
        $("div").addClass("row4");




        firstclick++;
    }
    else if(firstclick == 1){
        $("div").addClass("row3");
        $("div").removeClass("row4");



        firstclick++;
    }


    document.getElementById('whats-on1').style.cssText = 'opacity:0.5;';
    document.getElementById('whats-on2').style.cssText = 'opacity:0.5;';
    document.getElementById('coming-soon1').style.cssText = 'opacity:1;';
    document.getElementById('coming-soon2').style.cssText = 'opacity:1;';

    document.getElementById('coming-soon1').style.cssText = 'text-decoration: underline;';
    document.getElementById('coming-soon2').style.cssText = 'text-decoration: underline;';



    document.getElementById('image1').style.cssText = 'opacity:0;';
    document.getElementById('image2').style.cssText = 'opacity:0;';
    document.getElementById('image3').style.cssText = 'opacity:0;';
    document.getElementById('image4').style.cssText = 'opacity:0;';
    document.getElementById('image5').style.cssText = 'opacity:0;';
    document.getElementById('image6').style.cssText = 'opacity:0;';
    document.getElementById('image7').style.cssText = 'opacity:0;';
    document.getElementById('image8').style.cssText = 'opacity:0;';

document.getElementById('image9').style.top = '-560px';
    document.getElementById('image10').style.top = '-560px';
    document.getElementById('image11').style.top = '-560px';
    document.getElementById('image12').style.top = '-560px';
    document.getElementById('image13').style.top = '-560px';
    document.getElementById('image14').style.top = '-560px';
    document.getElementById('image15').style.top = '-560px';
    document.getElementById('image16').style.top = '-560px';


    document.getElementById('image9').style.cssText = 'opacity:1;';
    document.getElementById('image10').style.cssText = 'opacity:1;';
    document.getElementById('image11').style.cssText = 'opacity:1;';
    document.getElementById('image12').style.cssText = 'opacity:1;';
    document.getElementById('image13').style.cssText = 'opacity:1;';
    document.getElementById('image14').style.cssText = 'opacity:1;';
    document.getElementById('image15').style.cssText = 'opacity:1;';
    document.getElementById('image16').style.cssText = 'opacity:1;';





    document.getElementById("ComingSoonRow").setAttribute("style" , "width:100%");

}

function test(){
    alert("TEST WORKS!!");
}


// function DarkenBackground(){
//
//     alert("HI");
//     $()
// }




