function formatFirstPage(firstPage){

	var title = $('<h1>')
	title.addClass('first-page-title')
	title.append('Handbook <br>' + $('.handbook')[0].getAttribute('title'))
	$(firstPage).append(title)

	var author = $('<h2>')
	author.addClass('first-page-author')
	author.append($('.handbook')[0].getAttribute('author'))
	$(firstPage).append(author)
	
}