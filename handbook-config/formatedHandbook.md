<?xml version="1.0" encoding="UTF-16"?><div class="" id="rootElement">
<headline>
<div>
<div class="title markdown"># [A simple Handbook](#rootElement)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/handbook.md) </div>
</div>
<div class="author markdown">## Thomas Auriel</div>
<div class="version markdown">## Version 0.5</div>
<div class="date markdown">## 05/04/2018</div>
</headline>
<content class="content markdown"/>
<toc class="toc markdown">
- [Presentation](#Presentation)
- [Mechanism](#Mechanism)
  - [Markdown](#Markdown)
  - [Data folder structure](#datastructure)
  - [Note Connection](#tags)
  - [Use the Jar to generate the final Markdown File](#generation)
- [Elements](#Elements)
  - [Metadata](#Metadata)
  - [Structure and Template](#template)
  - [Other Elements](#OtherElements)
  - [Equations](#Equations)
- [Data Structure](#DataStructure)
  - [Element 1](#El1)
  - [Element 21](#El21)
  - [Element 22](#El22)
  - [Element 3](#El3)
  - [Element 4](#El4)
</toc>
<subcontent class="subcontent">
<div class="handbook" id="Presentation">
<notetitle>
<div class="title markdown"># [Presentation](#Presentation)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/00-presentation/presentation.md) </div>
</notetitle>
<tags class="tags markdown">
- [Markdown](#Markdown)
</tags>
<tasks/>
<dashboard/>
<toc class="toc markdown">
</toc>
<content class="content markdown">## A handbook
This handbook is a tool which provides a simple handbook rendered through Markdown and HTML.

## Website
This tool is published on GitHub: https://github.com/ThomasAuriel/HTML-Handbook. It is **free** and available to download. **You should not pay** to get this tool.

## Motivation
This tool provides a way to display information similarly to a handbook. All information is displayed on a unique page and each note follow each other. Moreover, a system based on a tags and references allow to navigate in the whole document. No other tool allows to do this in a light way. To run this handbook you need a modern internet browser, a simple text editor and Java 1.5 at least. My personal recommendations go to Firefox (I prepare another tool for this browser), Typora (a very handy and beautiful Markdown editor).  That's all. You do not need a server to host the notebook, and you do not need to install the software.

Some other software exists to provide a way to display and organise information. I propose you a list of few and most notables.
- **OneNote**: probably the best known. This software allows to display, organise and edit notes, to share them and to read them in a very friendly interface. Their several limitation which are: not free licence (property of Microsoft), need to install it, cannot export all notes in another software easily.
- **TiddlyWiki**: It is well known tools. It is free (no cost and free to read and modify the code). The community is large and different tools can be installed on it to bring new features. Finally, *it can run entirely in a modern web browser* and use a friendly interface (*Markdown syntax*). Several disadvantages exist: The whole information is stored in a one html file. This file can be large if you embedded data in it or wrote lots of content. It is possible to share fragments of a handbook but it is not very friendly. Information is not displayed efficiently. To navigate inside the information, you need to follow a path similarly to a classic wiki. This does not allow to see the whole information on a unique page.
- **Zim** and similar software: Zim is a kind of software allowing to write notes similarly to a wiki using the *Markdown syntax*. This software has the same limitation as TiddlyWiki concerning the display of information. However, notes are stored in separate file which allows to easily share them. Since it is a software running on Debian (and possibly other Linux OS, I didn’t test) it is not cross-platform.

For all this reason, I developed this tools.
This tool must be able to:
- Provide a way to write notes in a simple syntax. I chose [Markdown] to do so associated to a [metadata] system.
- Display information in a stream. This is done by rendering the whole handbook in a unique html page.
- Provide a way to easily share notes and reorganise the handbook. This is possible by moving notes between handbooks or folders.
- Be able to read the handbook on multiple platform.

The current version of these tools (Version 0.5) matches this features.

In the futur and next version I would like to be able to run this in a unique webpage but some limitation due to security in webbrowser does not allow me to do this (see [limitations]).

[Markdown]: #markdown
[metadata]: #metadata
[limitations]: #limitations</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="Mechanism">
<notetitle>
<div class="title markdown"># [Mechanism](#Mechanism)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/10-Mechanism/00-Mechanism.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc class="toc markdown">
- [Markdown](#Markdown)
- [Data folder structure](#datastructure)
- [Note Connection](#tags)
- [Use the Jar to generate the final Markdown File](#generation)
</toc>
<content class="content markdown">In this section, the organisation of the handbook is described.</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent class="subcontent">
<div class="" id="Markdown">
<notetitle>
<div class="title markdown"># [Markdown](#Markdown)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/10-Mechanism/10-Markdown/Markdown.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">![Markdown logo](./data/10-Mechanism/10-Markdown/markdownLogo.png)

According to the [official website](https://daringfireball.net/projects/markdown/):

&gt; Markdown is a text-to-HTML conversion tool for web writers. Markdown allows you to write using an easy-to-read, easy-to-write plain text format, then convert it to structurally valid XHTML (or HTML).
&gt;
&gt; Thus, ‘Markdown’ is two things: (1) a plain text formatting syntax; and (2) a software tool, written in Perl that converts the plain text formatting to HTML. See the Syntax page for details pertaining to Markdown’s formatting syntax. You can try it out, right now, using the online Dingus.

**In this handbook you only need to write your text according to the Markdown syntax.**
+ [Official website]
+ [Markdown Cheatsheet]

For more information, the JavaScript API used in this handbook is **[Markdown-it]**. Several plugins are included:
+ markdown-it-checkbox
+ markdown-it-imsize
+ markdown-it-highlightjs
+ markdown-it-katex
+ markdown-it-math
+ markdown-it-video (modified for the purpose of this handbook)


## Markdown syntax

The Markdown syntax is describe on the [official website] at the page : https://daringfireball.net/projects/markdown/syntax

[Official website]: https://daringfireball.net/projects/markdown/
[Markdown Cheatsheet]: https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#links
[Markdown-it]: https://github.com/markdown-it/markdown-it</content>
<references>
<div class="references markdown">
- [Data folder structure](#datastructure)
- [Image](#Image)
- [Presentation](#Presentation)
- [Note Connection](#tags)
- [Video](#Video)
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="datastructure">
<notetitle>
<div class="title markdown"># [Data folder structure](#datastructure)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/10-Mechanism/20-datastructure/datastructure.md) </div>
</notetitle>
<tags class="tags markdown">
- [Markdown](#Markdown)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">The data folder contains all the data to display in the final handbook file.
**Each notes are written using the [markdown] syntax and must use the extension associated: `.md`.**

*The first folder must contain one unique [markdown] file (.md).* This file represents the handbook first page. Once you defined this file, you can add multiple folders in it. They will be included in the handbook after the first page as sub-notes.
Sub-folders can contain multiple [Markdown] files. They will be regarded as a note in the same level during the generation. This means that they will be included in their parent as sub-notes. However, if a folder containing other sub-folder has multiple markdown files, then each markdown file will contain the sub-notes. This creates a confusing duplication of notes. This structure is to avoid.

Example of a **correct data structure**
```
data + handbook.md
     |
     + subnote1 + subnote1.md
     |          + subnote2.md
     |
     + subnote2 + subnote3.md
                + img.jpg
```

Example of a **data structure to avoid**:
```
data + handbook.md
     |
     + subnote1 + subnote1.md
     |          + subnote2.md
     |          |
     |          + subnote11 + subnote11.md
     |                      + subnote21.md
     |
     + subnote2 + subnote3.md
                + img.jpg
```

[Markdown]: #Markdown</content>
<references>
<div class="references markdown">
- [Use the Jar to generate the final Markdown File](#generation)
- [Note Connection](#tags)
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="tags">
<notetitle>
<div class="title markdown"># [Note Connection](#tags)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/10-Mechanism/30-tags/tagsMechanisme.md) </div>
</notetitle>
<tags class="tags markdown">
- [Data folder structure](#datastructure)
- [Markdown](#Markdown)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">The interest of this tool is to connect notes together. This is done thanks to their id.

## IDs
Each notes have an ID. This ID is an arbitrary text. The only condition is to respect the Markdown limitation on links.
There is still a limitation due to the Markdown syntax. When defining a link, it is possible to associate it a tooltip text. This done using a space after the URL of the link and before the tooltip text. Hence, if you want to point to a note from your note texts, you need to remove the spaces from its ID. I will not solve this limitation since it is due to the Markdown syntax and I wish my tool stick to this syntax.
Moreover, ID shall be unique to disambiguate references.

Finally, it is possible to refer to a note through a link in the markdown syntax. To do so use one of the next structures.

```md
1. [Presentation note](#presentation)
1. [Presentation note](#presentation "Define tooltips text")
1. [You can use an arbitrary case-insensitive reference text][Arbitrary case-insensitive reference text]
1. [You can use numbers for reference-style link definitions][1]
1. Or leave it empty and use the [link text itself].
1. Finally, you can also use an html tag : &lt;a href="#presentation" class="tag"&gt;Which is represented as a tag.&lt;/a&gt;

[arbitrary case-insensitive reference text]: #presentation
[1]: #presentation
[link text itself]: #presentation
```

Which show becomes :

1. [Presentation note](#presentation)
2. [Presentation note](#presentation "Define tooltips text")
3. [You can use an arbitrary case-insensitive reference text][Arbitrary case-insensitive reference text]
4. [You can use numbers for reference-style link definitions][1]
5. Or leave it empty and use the [link text itself].
6. Finally, you can also use an html tag : &lt;a href="#presentation" class="tag"&gt;Which is represented as a tag.&lt;/a&gt;

[arbitrary case-insensitive reference text]: #presentation
[1]: #presentation
[link text itself]: #presentation

## Tags
A second referring mechanism exists.
By tagging the note in its header with IDs from other note, a tag list is displayed in the handbook under the note title. This reference also appears in the targeted note at the bottom in the reference section. This mechanism is very handy and the heart of the tool.</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="generation">
<notetitle>
<div class="title markdown"># [Use the Jar to generate the final Markdown File](#generation)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/10-Mechanism/40-generation/generation.md) </div>
</notetitle>
<tags class="tags markdown">
- [Data folder structure](#datastructure)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">The generate the final Markdown file, use the CreateHandbook.jar file. This file requires Java 1.5 or higher to run it.

**Windows**
+ Be sure to have java 1.5 or higher.
+ Double click on the `.jar` file.

**Linux/Mac OS X**
+ Be sure to have java 1.5 or higher.
+ Run the script `run_CreateHandbook.sh` in the same folder (check permissions for the first run).

On each OS, to run correctly the jar file and the script, you need to be sure that the [data folder] must be in the same folder than the jar.


[data folder]: #datastructure</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
</subcontent>
</div>
<div class="" id="Elements">
<notetitle>
<div class="title markdown"># [Elements](#Elements)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/Elements.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc class="toc markdown">
- [Metadata](#Metadata)
- [Structure and Template](#template)
- [Other Elements](#OtherElements)
  - [Image](#Image)
  - [Video](#Video)
  - [Relative Path](#RelativePath)
- [Equations](#Equations)
</toc>
<content class="content markdown">To use this handbook, it is important to know the list of allowed elements in metadata .</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent class="subcontent">
<div class="" id="Metadata">
<notetitle>
<div class="title markdown"># [Metadata](#Metadata)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/00-metadata/metadata.md) </div>
</notetitle>
<tags class="tags markdown">
- [Structure and Template](#template)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">**A note should always start by metadata field.**

A metadata field is defined by using the non-official but quite common following syntax:
```md
​```
title: This is a title
id: this is an id
toc: 2
tags:
 - a tag
 - a-second-tag
date: dd/MM/yyyy
author: Thomas Auriel
version: version 0.5
activity: 2017-02-01
​```
```

The box defined by:
```md
​```

​```
```
Is the way to defined code area in Markdown files. The text inside is not interpreted by Markdown and display as it.

In this textbox, several field can be defined.
+ **title**: Title elements defines the title to display at the begging of the note in the final handbook. It is an obligation for a note to have a title. This is the minimal requirement.
```md
​```
title: This is a title
​```
```

+ **id**: The id represents a text used to link the element through the whole document (see [tag mechanism](#tags)). If this element is not specified, the title is used an ID. IDs shall be unique otherwise it is not possible to navigate correctly through the document.

  If you want to not use the id, since you does not require to target this specific note, and does not want to bother with the uniqueness of the id, then two values are possible. Use `none` or `-` to use random and unique id.

```md
​```
id: this is an id
​```
```


+ **toc**: The ToC element defines the size of the *table of content* to display in the current note. The value required is an integer. If this element is not provided, then the level is supposed to be 0 and no table of content are displayed.
```md
​```
toc: 2
​```
```

+ **tags**: The tag element is a list of ID referring to notes contained in the current handbook. This allows to display a list of tags at the begging of a note (after the title) and allow to navigate easily in the document.
```md
​```
tags:
- a-tag
- a-second-tag
​```
```

+ **date**: The requested value is a date (in any format) or a date format pattern according to `SimpleDateFormat` java class. This means to by providing to text `yyyy-MM-dd` this will display the date when the final handbook is generated.
```md
​```
date: dd/MM/yyyy
​```
```

+ **author**: The text provided in the field will be displayed on the first page in the author field.
```md
​```
author: Thomas Auriel
​```
```

+ **version**: The text provided in the field will be displayed on the first    page in the version field.
```md
​```
version: version 0.4
​```
```

+ **activity**: Activity field defines a note a temporal event. This can be useful to write a journal and keep information on past event. The required value must be a date following the format `yyyy-MM-dd`.
```md
​```
activity: 2017-02-01
​```
```

+ **template**: This field defines the template to use. If it is not specified, then the standard template is used.
```md
​```
template: standard.xml
​```
```</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="template">
<notetitle>
<div class="title markdown"># [Structure and Template](#template)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/10-structure/structure.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">This version of the HTML-handbook separate data from format.
This allows to define a unique template for the whole document [TODO - will change in the futur].

The structure of the standard format is :
``` xml
&lt;element&gt;
	&lt;title/&gt;
	&lt;tags/&gt;
	&lt;toc/&gt;
	&lt;content/&gt;
	&lt;references/&gt;
	&lt;hr/&gt;
	&lt;subcontent/&gt;
&lt;/element&gt;
```
## Structure
Their is seven elements. By order of apparition:

+ **element**: This tag is _necessary_ to interprete the template as the structure of an element.
+ **title**: The title tag represents the place that will be used by the title.
+ **headline**: Headline indicates to the handbook where the headline of a note should be placed. This headline will contain the title of the note, the author and the version of the note.
+ **tags**: This balise indicates to the handbook where to display tags. It will contain the list of tags.
+ **toc**: This balise indicates where to place the _table of content_.
+ **content**: The content structure contains the text. This text is formed following the [Markdown syntaxe](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet).
+ **reference**: This balise indicates where the references are displayed.

- **subcontent**: The subcontent structure indicates where sub-notes must be added.

## Modification of the template
By modifying this template you update all the notes. This provide a way to get a WYSIWYM editor. In other words, this architecture allows you to update the whole handbook structure with you need to modify each note to match your new template.
It is possible to reorder the tags and to add text.</content>
<references>
<div class="references markdown">
- [Metadata](#Metadata)
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="OtherElements">
<notetitle>
<div class="title markdown"># [Other Elements](#OtherElements)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/20-Other%20Elements/OtherElement.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc class="toc markdown">
- [Image](#Image)
- [Video](#Video)
- [Relative Path](#RelativePath)
</toc>
<content class="content markdown"/>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent class="subcontent">
<div class="" id="Image">
<notetitle>
<div class="title markdown"># [Image](#Image)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/20-Other%20Elements/20-images/image.md) </div>
</notetitle>
<tags class="tags markdown">
- [Markdown](#Markdown)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">It is possible to include images in the handbook with the markdown syntaxe.
To do this use the following syntax:
```
![alternative text to the image](path/to/image "tooltip text")
```

The alternative text to the image and the tooltip text can be removed:
```
![](path/to/image)
```</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="Video">
<notetitle>
<div class="title markdown"># [Video](#Video)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/20-Other%20Elements/30-videos/videos.md) </div>
</notetitle>
<tags class="tags markdown">
- [Markdown](#Markdown)
</tags>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">Videos can be embbed using the _non-official syntaxe_

``` md
## Youtube
@[youtube](dQw4w9WgXcQ)
## Vimeo
@[vimeo](19706846)
## Vine
@[vine](etVpwB7uHlw)
## Prezi
@[prezi](1kkxdtlp4241)
```

## Youtube
@[youtube](dQw4w9WgXcQ)
## Vimeo
@[vimeo](19706846)
## Vine
@[vine](etVpwB7uHlw)
## Prezi
@[prezi](1kkxdtlp4241)

## Source
+ [markdown-it-video](https://github.com/brianjgeiger/markdown-it-video)</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="RelativePath">
<notetitle>
<div class="title markdown"># [Relative Path](#RelativePath)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/20-Other%20Elements/40-relativePath/relativePath.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">If you share notes or reorganize them, it can be convenient to define relative path to resources. To do this, use a relative path as : `![image]( ./data/20-Elements/20-Other Elements/40-relativePath/image.png)` (without white space in the path). In this case, the targeted image is in the same folder than the note. This becomes `![image](./image.png)` .</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
</subcontent>
</div>
<div class="" id="Equations">
<notetitle>
<div class="title markdown"># [Equations](#Equations)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/20-Elements/30-Equations/equations.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard/>
<toc/>
<content class="content markdown">It is possible to write equations using this tools. To do this, you need to use the LaTeX syntax or the [ASCIIMath syntax].

## Libraries used

### ASCIIMath
[Markdown-it-math]: This library allows to write equations using the light [ASCIIMath syntax]. Since this syntaxe is light and simple, the library renders quickly equations. However, the library is limited and does not allow to write complex equations.
+ `_$` and `$_` define an inline text equation.
+ `_$$` and `$$_` define a block equation.
```md
The determinant _$Delta$_ is:
_$$
Delta = b^2 - 4*a*c
$$_
Second-order polynome solutions are :
_$$x_(1.2) = (-b +- sqrt{b^2 + 4 * a * c})/(2*a)$$_
```

The determinant _$Delta$_ is:
_$$
Delta = b^2 - 4*a*c 
$$_
Second-order polynome solutions are :
_$$x_{1,2} = (-b +- sqrt{b^2 + 4 * a * c})/(2*a)$$_

### LaTeX

**Important: To use the LaTeX syntax, you must unzip the file `MathJax-minimal.tar.gz` in the `js` file.**

[Markdown-it-katex] and [Katex]: To overcomes limitation in mathematical equation writing, Katex is embedded. These libraries allow to write equations using the complet LaTeX syntax.
+ `$` and `$` define an inline text equation.
+ `$$` and `$$` define a block equation.

```latex
The determinant $\Delta$ is:
$$
\Delta = b^2 - 4 \cdot a \cdot c
$$
Second-order polynome solutions are :
$$x_(1.2) = frac{-b +- \sqrt{b^2 + 4 \cdot a \cdot c}}{2 \cdot a}$$
```

The determinant $\Delta$ is:
$$
\Delta = b^2 - 4 \cdot a \cdot c
$$
Second-order polynome solutions are :
$$x_{1.2} = \frac{-b \pm \sqrt{b^2 + 4 \cdot a \cdot c}}{2 \cdot a}$$

## Source
+ [Markdown-it]
+ [Markdown-it-math]
+ [markdown-it-katex]
+ [Katex]

[Markdown-it]: https://github.com/markdown-it/markdown-it
[Markdown-it-math]: https://github.com/runarberg/markdown-it-math
[Markdown-it-katex]: https://github.com/waylonflinn/markdown-it-katex
[Katex]: https://github.com/Khan/KaTeX

[ASCIIMath Syntax]: https://runarberg.github.io/ascii2mathml/</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
</subcontent>
</div>
<div class="" id="DataStructure">
<notetitle>
<div class="title markdown"># [Data Structure](#DataStructure)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/DataSchedule.md) </div>
</notetitle>
<tags/>
<tasks/>
<dashboard>
<div class="dashboard_active markdown">
- [Element 21](#El21)
- [Element 22](#El22)
</div>
<div class="dashboard_waiting markdown">
- [Element 3](#El3)
- [Element 4](#El4)
</div>
<div class="dashboard_done markdown">
- [Element 1](#El1)
</div>
</dashboard>
<toc/>
<content class="content markdown">The Dashboard is a feature allowing you to organise yours tasks and activity. This is not based on time management neither than priority but simply on requirements. To perform a task the previous one shall be done.

## Previous tasks

So when you define a task you can use the element

```md
​```
previous:
 - a previous task ID
 - another previous task ID
​```
```

The both task shall be done to preform the task containing the `previous` structure.

## Task state

It is possible to define the state of a tasks. Three value are possible : `active`, `done`, `waiting`.

```md
​```
task: active
​```
or
​```
task: done
​```
or
​```
task: waiting
​```
```

By using this element, it is possible to overcome the normal behaviour of the dashboard and provide more control on the task status.

## Dashboard

The dashboard is defined using the element

```md
​```
dashboard:2
​```
```

The number associated to the dashboard provided a behaviour similar to the Table of Content.

The dashboard will show tasks defined on the next two levels.

## Example

The next note show an example of a dash board based on the structure:

```mermaid
graph LR
  E1[Element1]
  E21[Element21]
  E22[Element22]
  E3[Element3]

  E1--&gt;E21
  E1--&gt;E22
  E21--&gt;E3
  E22--&gt;E3
```</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent class="subcontent">
<div class="" id="El1">
<notetitle>
<div class="title markdown"># [Element 1](#El1)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/data/Element10.md) </div>
</notetitle>
<tags/>
<tasks>
<div class="status done">done</div>
<ul class="next">
<li>
<a class="active" href="#El21">Element 21</a>
</li>
<li>
<a class="active" href="#El22">Element 22</a>
</li>
</ul>
</tasks>
<dashboard/>
<toc/>
<content class="content markdown">The element comes first.</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="El21">
<notetitle>
<div class="title markdown"># [Element 21](#El21)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/data/Element21.md) </div>
</notetitle>
<tags/>
<tasks>
<div class="status active">active</div>
<ul class="previous">
<li>
<a class="done" href="#El1">Element 1</a>
</li>
</ul>
<ul class="next">
<li>
<a class="waiting" href="#El3">Element 3</a>
</li>
</ul>
</tasks>
<dashboard/>
<toc/>
<content class="content markdown">This element comes after Element 1</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="El22">
<notetitle>
<div class="title markdown"># [Element 22](#El22)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/data/Element22.md) </div>
</notetitle>
<tags/>
<tasks>
<div class="status active">active</div>
<ul class="previous">
<li>
<a class="done" href="#El1">Element 1</a>
</li>
</ul>
<ul class="next">
<li>
<a class="waiting" href="#El3">Element 3</a>
</li>
</ul>
</tasks>
<dashboard/>
<toc/>
<content class="content markdown">This element comes after Element 1</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="El3">
<notetitle>
<div class="title markdown"># [Element 3](#El3)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/data/Element30.md) </div>
</notetitle>
<tags/>
<tasks>
<div class="status waiting">waiting</div>
<ul class="previous">
<li>
<a class="active" href="#El21">Element 21</a>
</li>
<li>
<a class="active" href="#El22">Element 22</a>
</li>
</ul>
<ul class="next">
<li>
<a class="waiting" href="#El4">Element 4</a>
</li>
</ul>
</tasks>
<dashboard/>
<toc/>
<content class="content markdown">This element comes after Element 21 and Element 22</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
<div class="" id="El4">
<notetitle>
<div class="title markdown"># [Element 4](#El4)</div>
<div class="filepath markdown"> [![](./handbook-config/css/file.svg)](./data/30-DataSchedule/data/Element40.md) </div>
</notetitle>
<tags/>
<tasks>
<div class="status waiting">waiting</div>
<ul class="previous">
<li>
<a class="waiting" href="#El3">Element 3</a>
</li>
</ul>
</tasks>
<dashboard/>
<toc/>
<content class="content markdown">This element comes after Element 3</content>
<references>
<div class="references markdown">
</div>
<div class="activities markdown">
</div>
<div class="tasks markdown">
</div>
</references>
<hr/>
<subcontent/>
</div>
</subcontent>
</div>
</subcontent>
</div>
