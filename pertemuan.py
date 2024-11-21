import feedparser
from html import escape, unescape

# URL RSS feed Medium
FEED_URL = "https://medium.com/feed/@dikaelsaputra"

def fetch_medium_post_summary(feed_url, post_link):
    feed = feedparser.parse(feed_url)
    
    for entry in feed.entries:
        if entry.link == post_link:
            summary = entry.summary
            return summary

    return "Summary not found."

def update_readme(summary, readme_path, post_link):
    # Unescape HTML entities in the summary
    summary = unescape(summary)

    # Read the existing README content
    with open(readme_path, 'r', encoding='utf-8') as f:
        readme_content = f.readlines()

    # Find the section to update
    start_marker = "<!--START_SECTION:medium-->"
    end_marker = "<!--END_SECTION:medium-->"
    start_idx = None
    end_idx = None

    for idx, line in enumerate(readme_content):
        if start_marker in line:
            start_idx = idx
        if end_marker in line:
            end_idx = idx

    # Prepare new content with URL and summary
    new_content = f'[Baca di Medium]({post_link})\n\n{summary}\n'

    # If markers are found, replace the content in between
    if start_idx is not None and end_idx is not None:
        updated_content = readme_content[:start_idx + 1] + [new_content] + readme_content[end_idx:]

        # Write the updated content back to README.md
        with open(readme_path, 'w', encoding='utf-8') as f:
            f.writelines(updated_content)

if __name__ == "__main__":
    posts = [
        ("https://medium.com/@dikaelsaputra/cara-instal-netbeans-ide-di-windows-7e29e0815459?source=rss-272e0aace4a6------2", 'pertemuan2/README.md'),
        ("https://medium.com/@dikaelsaputra/netbeans-praktik-dasar-java-kelas-dan-objek-58e1f14e832a?source=rss-272e0aace4a6------2", 'pertemuan3/README.md'),
        ("https://medium.com/@dikaelsaputra/enkapsulasi-dan-akses-modifier-2157af7cf274?source=rss-272e0aace4a6------2", 'pertemuan4/README.md'),
        ("https://medium.com/@dikaelsaputra/inheritance-dalam-java-2145648ad259?source=rss-272e0aace4a6------2", 'pertemuan5/README.md'),
        ("https://medium.com/@dikaelsaputra/polimorfisme-dalam-pemrograman-java-39890c0a08ea?source=rss-272e0aace4a6------2", 'pertemuan6/README.md'),
        ("https://medium.com/@dikaelsaputra/abstraksi-dan-kelas-abstrak-dalam-pemrograman-java-f616a1260c80?source=rss-272e0aace4a6------2", 'pertemuan9/README.md'),
        ("https://medium.com/@dikaelsaputra/memahami-konsep-interface-dan-implementasinya-dalam-pemrograman-java-17ad4039398c?source=rss-272e0aace4a6------2", 'pertemuan10/README.md'),
        ("https://medium.com/@dikaelsaputra/komposisi-dan-agregasi-d560fbf82fa5?source=rss-272e0aace4a6------2", 'pertemuan11/README.md'),
        ("https://medium.com/@dikaelsaputra/file-i-o-dan-serialisasi-dalam-java-63dbc3c01cf5?source=rss-272e0aace4a6------2", 'pertemuan12/README.md')
    ]
    
    for post_link, readme_path in posts:
        summary = fetch_medium_post_summary(FEED_URL, post_link)
        update_readme(summary, readme_path, post_link)
