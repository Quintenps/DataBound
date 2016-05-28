<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>Simple Data</title>
    <link href="../dist/components/reset.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/site.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/container.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/grid.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/header.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/image.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/button.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/shape.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/breadcrumb.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/form.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/input.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/table.css" rel="stylesheet" type="text/css">



    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
    <style type="text/css">
    body {
    background-color: #FFFFFF;
    }
    .ui.menu .item img.logo {
    margin-right: 1.5em;
    }
    .main.container {
    margin-top: 7em;
    }
    .wireframe {
    margin-top: 2em;
    }
    .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
    }
    </style>
</head>
<body>
<?php include 'includes/menu.php'; ?>
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Dashboard</a>
                </div>
            </div>
        </div>
<br /><br />
<div class="ui two column centered grid" style="padding:25px 0px;">
  <div class="column ui centered center aligned segment">
    <img src="images/1_quintenpeels.jpg" class="ui small centered circular bordered image">
    <h3>Quinten Peels</h3><p>Member since 3 may 2016</p><br />
    <table class="ui basic centered center aligned celled table">
  <tbody>
    <tr>
      <td>Used datafields</td>
      <td>92</td>
    </tr>
    <tr>
      <td>Cards shared</td>
      <td>16</td>
    </tr>
    <tr>
      <td>Cards received</td>
      <td>92</td>
    </tr>
  </tbody>
</table>

  </div>
</div>
<form class="ui form">
<div class="ui form">
  <h2>Personal data</h2>
  <div class="fields">
    <div class="six wide field">
      <label>First name</label>
      <input type="text" placeholder="First Name">
    </div>
    <div class="four wide field">
      <label>Middle</label>
      <input type="text" placeholder="Middle Name">
    </div>
    <div class="six wide field">
      <label>Last name</label>
      <input type="text" placeholder="Last Name">
    </div>
  </div>
    <div class="fields">
    <div class="two wide field">
      <label>Gender</label>
      <select class="ui compact selection dropdown">
        <option selected="" value="male">Male</option>
        <option value="female">Female</option>
      </select>
    </div>
    <div class="four wide field">
      <label>Date of Birth</label>
      <input type="text" placeholder="Date of Birth">
    </div>
    <div class="four wide field">
      <label>Place of Birth</label>
      <input type="text" placeholder="Place of Birth">
    </div>
  </div>
</div><br /><br />

<div class="ui form">
  <h2>Web presence</h2>
  <div class="fields">

    <div class="two wide field">
      <label>Facebook</label>
      <div class="ui left labeled input">
        <div class="ui label"><i class="facebook icon"></i></div>
        <input type="text" placeholder="/John.Dee">
      </div>
    </div>
    <div class="two wide field">
      <label>Twitter</label>
      <div class="ui left labeled input">
        <div class="ui label"><i class="twitter icon"></i></div>
        <input type="text" placeholder="@JohnDee">
      </div>
    </div>
    <div class="two wide field">
      <label>Skype</label>
      <div class="ui left labeled input">
        <div class="ui label"><i class="skype icon"></i></div>
        <input type="text" placeholder="JohnDee">
      </div>
    </div>

     <div class="three wide field">
      <label>Email (Personal)</label>
        <input type="text" placeholder="John@gmail.com">
    </div>
    <div class="three wide field">
      <label>Email (Business)</label>
        <input type="text" placeholder="John@office.com">
    </div>
    <div class="three wide field">
      <label>Website</label>
        <input type="text" placeholder="http://mysite.com">
    </div>


  </div>


    <div class="fields">
    <div class="two wide field">
      <label>Gender</label>
      <select class="ui compact selection dropdown">
        <option selected="" value="male">Male</option>
        <option value="female">Female</option>
      </select>
    </div>
    <div class="four wide field">
      <label>Date of Birth</label>
      <input type="text" placeholder="Date of Birth">
    </div>
    <div class="four wide field">
      <label>Place of Birth</label>
      <input type="text" placeholder="Place of Birth">
    </div>
  </div>
</div>
<br /><br />
  <button class="ui button  green large" type="submit">Submit</button>
</form>        



    </div>
<?php include 'includes/footer.php'; ?>
</body>
</html>