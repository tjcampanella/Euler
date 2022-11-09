FORCE:

prod: tests github

commit: tests
	git add . && git commit -a

github: FORCE
	git add .
	git commit -a
	git push

tests: FORCE
	cd e1 && lein spec
	cd e2 && lein spec
	cd e3 && lein spec
	cd e4 && lein spec
	cd e5 && lein spec
	cd e6 && lein spec
	cd e7 && lein spec
	cd e8 && lein spec
	cd e9 && lein spec
	cd e10 && lein test
	cd e11 && lein spec
	cd e12 && lein spec
