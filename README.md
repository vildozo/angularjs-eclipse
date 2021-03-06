AngularJS Eclipse Plugin
=================

[![Build Status](https://secure.travis-ci.org/angelozerr/angularjs-eclipse.png)](http://travis-ci.org/angelozerr/angularjs-eclipse)
[![Eclipse install](https://marketplace.eclipse.org/sites/all/modules/custom/marketplace/images/installbutton.png)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1605088)

[AngularJS](http://angularjs.org/) [Eclipse](//www.eclipse.org) Plugin extends Eclipse WTP to :

 * provides an HTML editor which supports [AngularJS](http://angularjs.org/) expression and directive. See [HTML features](https://github.com/angelozerr/angularjs-eclipse/wiki/HTML-Features) for more informations.
 * provides an [Angular Explorer](https://github.com/angelozerr/angularjs-eclipse/wiki/Angular-Explorer-View) view which displays modules, controllers of your project in a tree.
 * provides a Javascript editor which supports AngularJS features (modules, etc). See [Javascript features](https://github.com/angelozerr/angularjs-eclipse/wiki/Javascript-Features) for more informations.

AngularJS Eclipse is based on [tern.java](https://github.com/angelozerr/tern.java) to manage powerful completion on HTML files (AngularsJS Expression, directive, modules) and Javascripts files (see [Tern Eclipse IDE](https://github.com/angelozerr/tern.java/wiki/Tern-Eclipse-IDE))

If you start with AngularJS Eclipse, please read [Getting Started](https://github.com/angelozerr/angularjs-eclipse/wiki/Getting-Started).

# Installation

AngularJS Eclipse is developed/tested with Eclipse 4.4 Luna. It is advised to use Eclipse 4.4 Luna (even if AngularJS Eclipse could work with older version of Eclipse).

To install AngularJS Eclipse, please read [Installation - Update Site](https://github.com/angelozerr/angularjs-eclipse/wiki/Installation-Update-Site) section.

# AngularJS Configuration

Before opening your HTML files (to benefit with angular highlight, completion, hover, validation), you must  convert your project to AngularJS Project : 

![Convert To AngularJS Project](https://github.com/angelozerr/angularjs-eclipse/wiki/images/ConfigureToAngularProject.png)

# HTML Editor

After that, you can open your HTML with standard WTP HTML, JSP Editor. 
You will see that AngularJS directive + EL are highlighted, completion is available for directive name : 

![AngulerJS Editor Overview](https://github.com/angelozerr/angularjs-eclipse/wiki/images/HTMLAngularEditorOverview.png)

After [configuring tern server](https://github.com/angelozerr/tern.java/wiki/Tern-Eclipse-IDE-Node.js), completions, hover, validation, hyperlink are available for modules, controllers, angular expression EL : 

![Completion for expression](https://github.com/angelozerr/angularjs-eclipse/wiki/images/HTMLAngularCompletionExpressionFn.png)

See [HTML features](https://github.com/angelozerr/angularjs-eclipse/wiki/HTML-Features) for more informations.

# Javascript Editor

See [Javascript features](https://github.com/angelozerr/angularjs-eclipse/wiki/Javascript-Features) and [Tern Eclipse IDE](https://github.com/angelozerr/tern.java/wiki/Tern-Eclipse-IDE) for more informations.

# Build

AngularJS Eclipse is build with this [cloudbees job](https://opensagres.ci.cloudbees.com/job/angularjs-eclipse/).
