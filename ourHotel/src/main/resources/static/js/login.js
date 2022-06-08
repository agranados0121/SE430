function validate() {
    var un = document.getElementById("exampleInputEmail1").value;
    var pw = document.getElementById("exampleInputPassword1").value;
    var valid = false;

    var unArray = ["jsmith@gmail.com", "jdoe@gmail.com", "aben@gmail.com", "jbilly@outlook.com"];
    var pwArray = ["password", "password", "password", "password"];
    var fnArray = ["John Smith", "Jane Doe", "Lisa Cain", "Jenny Dempsey"];

    for (var i=0; i <unArray.length; i++) {
        if ((un == unArray[i]) && (pw == pwArray[i])) {
            valid = true;
            break;
        }
    }

    if (valid) {
        alert ("Login was successful");
        document.getElementById("mandatory1").value = un;
    }
    else {
        alert("Invalid Username and/or Password! Please try again. You will not be able to submit this form without a successful login")
        document.getElementById("pword").value = "";
        document.getElementById("usern").value = "";
        document.getElementById("usern").focus();
    }
}
