package pl.mg.cms.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;

/**
 * A Book.
 */
@Entity
@Table(name = "book")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "quicklook")
    private byte[] quicklook;

    @Column(name = "quicklook_content_type")
    private String quicklookContentType;

    @Lob
    @Column(name = "book_file")
    private byte[] bookFile;

    @Column(name = "book_file_content_type")
    private String bookFileContentType;

    @Column(name = "release_date")
    private Instant releaseDate;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Book id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public Book title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getQuicklook() {
        return this.quicklook;
    }

    public Book quicklook(byte[] quicklook) {
        this.setQuicklook(quicklook);
        return this;
    }

    public void setQuicklook(byte[] quicklook) {
        this.quicklook = quicklook;
    }

    public String getQuicklookContentType() {
        return this.quicklookContentType;
    }

    public Book quicklookContentType(String quicklookContentType) {
        this.quicklookContentType = quicklookContentType;
        return this;
    }

    public void setQuicklookContentType(String quicklookContentType) {
        this.quicklookContentType = quicklookContentType;
    }

    public byte[] getBookFile() {
        return this.bookFile;
    }

    public Book bookFile(byte[] bookFile) {
        this.setBookFile(bookFile);
        return this;
    }

    public void setBookFile(byte[] bookFile) {
        this.bookFile = bookFile;
    }

    public String getBookFileContentType() {
        return this.bookFileContentType;
    }

    public Book bookFileContentType(String bookFileContentType) {
        this.bookFileContentType = bookFileContentType;
        return this;
    }

    public void setBookFileContentType(String bookFileContentType) {
        this.bookFileContentType = bookFileContentType;
    }

    public Instant getReleaseDate() {
        return this.releaseDate;
    }

    public Book releaseDate(Instant releaseDate) {
        this.setReleaseDate(releaseDate);
        return this;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        return id != null && id.equals(((Book) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", quicklook='" + getQuicklook() + "'" +
            ", quicklookContentType='" + getQuicklookContentType() + "'" +
            ", bookFile='" + getBookFile() + "'" +
            ", bookFileContentType='" + getBookFileContentType() + "'" +
            ", releaseDate='" + getReleaseDate() + "'" +
            "}";
    }
}
