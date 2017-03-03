










/* When the user clicks on the button,
 toggle between hiding and showing the dropdown content */
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

// function underline(){
//     document.getElementById("whats-on1").style.cssText = "opacity:0;";
//     document.getElementById("whats-on2").style.cssText = "opacity:0;";
// }







function expand1(){
    DarkenComingSoon();
}


function expand2(){
    DarkenComingSoon();
}
function expand3(){
    DarkenComingSoon();
}
function expand4(){
    DarkenComingSoon();
}
function expand5(){
    DarkenWhatsOn();
}
function expand6(){
    DarkenWhatsOn();
}
function expand7(){
    DarkenWhatsOn();
}
function expand8(){
    DarkenWhatsOn();
}


function DarkenComingSoon(){

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




function DarkenWhatsOn(){
    document.getElementById('whats-on1').style.cssText = 'opacity:0.5;';
    document.getElementById('whats-on2').style.cssText = 'opacity:0.5;';
    document.getElementById('coming-soon1').style.cssText = 'opacity:1;';
    document.getElementById('coming-soon2').style.cssText = 'opacity:1;';

    document.getElementById('coming-soon1').style.cssText = 'text-decoration : underline; white-space: pre;';
    document.getElementById('coming-soon2').style.cssText = 'text-decoration : underline; white-space: pre;';


    document.getElementById('image1').style.cssText = 'opacity:0;';
    document.getElementById('image2').style.cssText = 'opacity:0;';
    document.getElementById('image3').style.cssText = 'opacity:0;';
    document.getElementById('image4').style.cssText = 'opacity:0;';
    document.getElementById('image5').style.cssText = 'opacity:0;';
    document.getElementById('image6').style.cssText = 'opacity:0;';
    document.getElementById('image7').style.cssText = 'opacity:0;';
    document.getElementById('image8').style.cssText = 'opacity:0;';

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