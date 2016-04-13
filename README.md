Documentation project to help Java developers who are new to Python and [cmfe_tests](https://github.com/RedHatQE/cfme_tests/) to get started.  Whenever possible the same variable, class, function names are used with additional Java flavors added/
## Key Python concepts
- kwargs
- lambda 

## Overview
Core components of cfme_tests framework:
- [Provider](https://github.com/RedHatQE/cfme_tests/blob/master/cfme/common/provider.py) fixtures which define CRUD operations and supporting mapping between business-values and ui widgets
- low-level ui fixtures

## Why fixtures?
Fixtures allows you to write test with high level of abstraction
```
provider = get_crud('hawkular')
provider.create()
```
vs low-level mouse-interaction (aka 'force-nagivation')
```
click on Middleware -> Providers menu
fill in name, port number
click Add button
```

Hawkular Provider walk-through
[Hawkular Provider](https://github.com/vnugent/cfme_tests_4J/blob/master/src/org/miq/test/middleware/HawkularProvider.java)
