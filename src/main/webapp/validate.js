/**
 * 
 */

function validate() {
    let tid = document.getElementById("tid").value;
    let tname = document.getElementById("tnameid").value;
    let branch = document.getElementById("branchId").value;
    let per = document.getElementById("perId").value;


    if (isBlank(tid)) {
        document.getElementById("tMsg").innerHTML = "Enter Trainee id";
        document.getElementById("tMsg").style.color = "red";
        return false;
    }

    if (isBlank(tname)) {
        document.getElementById("tnameMsg").innerHTML = "Enter Trainee name";
        document.getElementById("tnameMsg").style.color = "red";
        return false;
    }

    if (isBlank(branch)) {
        document.getElementById("branchMsg").innerHTML = "Enter Branch";
        document.getElementById("branchMsg").style.color = "red";
        return false;
    }

    if (isBlank(per)) {
        document.getElementById("perMsg").innerHTML = "Enter Percentage";
        document.getElementById("perMsg").style.color = "red";
        return false;
    }
 
    return true;
}
function isBlank(val) {
    return (val.trim() == "") ? true : false;
}