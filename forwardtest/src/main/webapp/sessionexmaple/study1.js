$(function () {
    var time = 60;
    timer = setInterval(function () {
        time =+ time-1;
        show.innerHTML = time;
        if(time == 0){
            stop();
   			location.href="sessionexmaple/session1.html";
        }
    }, 1000);

    function stop(){
        console.log("stopped")
        alert("세션 종료")
        clearInterval(timer)
      }
});