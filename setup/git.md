# git setup

## git setup on linux

- setup using ssh 
- install ssh on linux

```bash
    # generate new ssh key
    ssh-keygen -t ed25519 -C "your-email@example.com"
    
    # bash will work properly
    eval "$(ssh-agent -s)"

    # copy the content of id_ed25519.pub
    cat ~/.ssh/id_ed25519.pub
```

- Go to Settings > SSH and GPG keys > New SSH key.

```bash
    # test is it working or not 
    ssh -T git@github.com #it will give : Hi your-username! You've successfully authenticated, but GitHub does not provide shell access.
```
