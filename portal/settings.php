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
    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">
    <link href="../dist/style.css" rel="stylesheet" type="text/css">



    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/table.css" rel="stylesheet" type="text/css">

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
<body class="Site">
<header><?php include 'includes/menu.php'; ?></header>
<main class="Site-content">
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

<div class="ui grid" style="padding:25px 0px;">
  <div class="three column row">
    <div class="column"></div>
    <div class="column center aligned">
    <img src="images/1_quintenpeels.jpg" class="ui small centered circular bordered image">
    <h3>Quinten Peels</h3><p>Member since 3 may 2016</p><br />
      <table class="ui basic celled table">
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
    <div class="column"></div>

  </div>
</div>

<div class="ui grid">
  <div class="three column row">
    <div class="column"><form class="ui form">
  <h3>Profile picture</h3>
  <div class="field">
    <label>Avatar URL (Has to end with .jpg)</label>
    <input type="text" disabled="" placeholder="http://i.imgur.com/A1MnGZ7.jpg">
  </div>
  <button class="ui button green" type="submit">Update avatar</button>
</form></div>
<div class="column"><form class="ui form">
  <h3>Update password</h3>
  <div class="field">
    <label>Current Password</label>
    <input type="text" name="currentPassword" placeholder="Current password">
  </div>
  <div class="field">
    <label>New Password</label>
    <input type="text" name="newPassword" placeholder="New password">
  </div>
  <button class="ui button green" type="submit">Update password</button>
</form></div>
        <div class="column"><form class="ui form">
  <h3>Update nickname</h3>
  <div class="field">
    <label>New nickname</label>
    <input type="text" name="last-name" placeholder="New nickname">
  </div>
  <button class="ui button green" type="submit">Update nickname</button>
</form></div>
  </div>
</div>
        



    </div></main>
<footer><?php include 'includes/footer.php'; ?></footer>
</body>
</html>